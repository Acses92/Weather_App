package ru.kravchenkoanatoly.weatherApp

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand
import ru.kravchenkoanatoly.weatherapp.detailfragment.DetailFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.mainfragment.MainFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.settingfragment.SettingsFragmentNavigationProvider
import javax.inject.Inject

class MainFragmentNavigationProviderImpl @Inject constructor(): MainFragmentNavigationProvider {
    override fun goToDetailFragment(): NavCommand {
        TODO("Not yet implemented")
    }

    override fun goToSettingFragment(): NavCommand {
        TODO("Not yet implemented")
    }

}

class DetailFragmentNavigationProviderImpl @Inject constructor(): DetailFragmentNavigationProvider{
    override fun goToMainFragment(): NavCommand {
        TODO("Not yet implemented")
    }

    override fun goToSettingFragment(): NavCommand {
        TODO("Not yet implemented")
    }

}

class SettingsFragmentNavigationProviderImpl @Inject constructor(): SettingsFragmentNavigationProvider {
    override fun goToMainFragment(): NavCommand {
        TODO("Not yet implemented")
    }

    override fun goToDetailFragment(): NavCommand {
        TODO("Not yet implemented")
    }

}