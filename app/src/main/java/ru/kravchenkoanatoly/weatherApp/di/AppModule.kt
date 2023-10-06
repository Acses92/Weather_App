package ru.kravchenkoanatoly.weatherApp.di

import android.content.Context
import androidx.room.Room
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.logging.HttpLoggingInterceptor
import org.apache.http.params.HttpParams
import ru.kravchenkoanatoly.weatherApp.data.sources.local.AppConstant.databaseName
import ru.kravchenkoanatoly.weatherApp.data.sources.local.AppDatabase
import ru.kravchenkoanatoly.weatherApp.data.sources.local.AppPreferences
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): AppPreferences =
            AppPreferences(
                context.getSharedPreferences(
                    "app_shared_preferences",
                    Context.MODE_PRIVATE
                )
            )

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
            Room.databaseBuilder(context,AppDatabase::class.java, databaseName )
                .build()

    @Provides
    @Singleton
    fun provideMoshi(): Moshi =
            Moshi.Builder()
                .build()


}