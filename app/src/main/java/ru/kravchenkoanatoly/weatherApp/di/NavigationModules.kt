package ru.kravchenkoanatoly.weatherApp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kravchenkoanatoly.weatherApp.DetailFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherApp.MainFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherApp.SettingsFragmentNavigationProviderImpl
import ru.kravchenkoanatoly.weatherapp.detailfragment.DetailFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.mainfragment.MainFragmentNavigationProvider
import ru.kravchenkoanatoly.weatherapp.settingfragment.SettingsFragmentNavigationProvider

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