package ru.kravchenkoanatoly.weatherapp.settingscreenfeature

import ru.kravchenkoanatoly.common.NavCommand

interface SettingsFragmentNavigationProvider {
    fun goToMainFragment(): NavCommand

    fun goToDetailFragment(): NavCommand
}