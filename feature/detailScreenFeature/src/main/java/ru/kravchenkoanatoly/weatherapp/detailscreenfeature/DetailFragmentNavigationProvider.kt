package ru.kravchenkoanatoly.weatherapp.detailscreenfeature

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand

interface DetailFragmentNavigationProvider {
    fun goToMainFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}