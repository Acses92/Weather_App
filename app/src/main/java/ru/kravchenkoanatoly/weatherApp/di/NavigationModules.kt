package ru.kravchenkoanatoly.weatherApp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kravchenkoanatoly.weatherApp.DetailFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherApp.MainFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherApp.SettingsFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherapp.detailscreenfeature.DetailFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.mainscreenfeature.MainFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.settingscreenfeature.SettingsFragmentNavigationProvider

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModules {
    @Binds
    fun bindMainFragmentNavigationProvider(arg: MainFragmentNavigationProviderImpl): MainFragmentNavigationProvider

    @Binds
    fun bindDetailFragmentNavigationProvider(arg: DetailFragmentNavigationProviderImpl): DetailFragmentNavigationProvider

    @Binds
    fun bindSettingFragmentNavigationProvider(arg: SettingsFragmentNavigationProviderImpl): SettingsFragmentNavigationProvider

}