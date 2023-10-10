package ru.kravchenkoanatoly.weatherapp.detailfragment

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand

interface DetailFragmentNavigationProvider {
    fun goToMainFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}