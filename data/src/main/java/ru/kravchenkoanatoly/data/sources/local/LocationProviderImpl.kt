package ru.kravchenkoanatoly.data.sources.local

import android.Manifest
import android.content.Context
import android.util.Log
import androidx.annotation.RequiresPermission
import androidx.core.location.component1
import androidx.core.location.component2
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationToken
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.android.gms.tasks.OnTokenCanceledListener
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import ru.kravchenkoanatoly.common.ResultState
import ru.kravchenkoanatoly.data.sources.local.models.GpsCoordinatesDto

class LocationProviderImpl constructor(
    private val context: Context){

    companion object{
        private const val TAG = "Location"
    }

    @RequiresPermission(anyOf = [Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION])
    operator fun invoke(): Flow<ResultState<GpsCoordinatesDto>> {
        return callbackFlow {
            trySend(ResultState.Loading)
            val fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
            fusedLocationClient.getCurrentLocation(
                Priority.PRIORITY_BALANCED_POWER_ACCURACY,
                object : CancellationToken() {
                    override fun onCanceledRequested(p0: OnTokenCanceledListener) =
                            CancellationTokenSource().token

                    override fun isCancellationRequested() = false
                }).addOnSuccessListener { location ->
                if (location != null) {
                    val (latitude, longitude) = location
                    // Send the new location to the Flow observers
                    trySend(ResultState.Success(GpsCoordinatesDto(latitude, longitude)))
                } else {
                    // Send Failure to the Flow observers
                    trySend(ResultState.Failure("Not able set location"))
                }
            }.addOnFailureListener {
                Log.d(TAG, it.message ?: "")
                // Send Failure to the Flow observers
                trySend(ResultState.Failure("Not able set location"))
            }.addOnCanceledListener {
                Log.d(TAG, "Cancelled")
                // Send Failure to the Flow observers
                trySend(ResultState.Failure("Cancelled"))
            }
            awaitClose {
                Log.d(TAG, "Stopped observing location update")
            }
        }

    }


}