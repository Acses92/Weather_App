package ru.kravchenkoanatoly.weatherapp.settingscreenfeature

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand

interface SettingsFragmentNavigationProvider {
    fun goToMainFragment(): NavCommand

    fun goToDetailFragment(): NavCommand
}