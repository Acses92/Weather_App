package ru.kravchenkoanatoly.weatherApp

import android.app.Application
import androidx.core.os.BuildCompat
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        timberInit()
    }

    private fun timberInit() {
        Timber.plant(Timber.DebugTree())

    }

}