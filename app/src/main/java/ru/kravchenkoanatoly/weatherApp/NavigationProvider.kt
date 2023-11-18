package ru.kravchenkoanatoly.weatherApp

import ru.kravchenkoanatoly.common.NavCommand
import ru.kravchenkoanatoly.weatherapp.R
import ru.kravchenkoanatoly.weatherapp.detailscreenfeature.DetailFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.mainscreenfeature.MainFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.settingscreenfeature.SettingsFragmentNavigationProvider
import javax.inject.Inject

class MainFragmentNavigationProviderImpl @Inject constructor(): MainFragmentNavigationProvider {
    override fun goToDetailFragment(): NavCommand = NavCommand(
        action = R.id.action_mainFragment_to_detailFragment
    )

    override fun goToSettingFragment(): NavCommand = NavCommand(
        action = R.id.action_mainFragment_to_settingsFragment
    )

}

class DetailFragmentNavigationProviderImpl @Inject constructor(): DetailFragmentNavigationProvider{
    override fun goToMainFragment(): NavCommand = NavCommand(
        action = R.id.action_detailFragment_to_mainFragment
    )

    override fun goToSettingFragment(): NavCommand = NavCommand(
        action = R.id.action_detailFragment_to_settingsFragment
    )

}

class SettingsFragmentNavigationProviderImpl @Inject constructor(): SettingsFragmentNavigationProvider {
    override fun goToMainFragment(): NavCommand = NavCommand(
        action = R.id.action_settingsFragment_to_mainFragment
    )

    override fun goToDetailFragment(): NavCommand = NavCommand(
        action = R.id.action_settingsFragment_to_detailFragment
    )

}