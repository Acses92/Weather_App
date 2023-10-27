package ru.kravchenkoanatoly.weatherapp.mainscreenfeature

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand

interface MainFragmentNavigationProvider {
    fun goToDetailFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}