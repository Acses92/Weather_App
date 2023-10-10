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
object NavigationModules {

    @Module
    @InstallIn(SingletonComponent::class)
    abstract class BindNavigationModule {
        @Binds
        abstract fun bindMainFragmentNavigationProvider(arg: MainFragmentNavigationProviderImpl): MainFragmentNavigationProvider

        @Binds
        abstract fun bindDetailFragmentNavigationProvider(arg: DetailFragmentNavigationProviderImpl): DetailFragmentNavigationProvider

        @Binds
        abstract fun bindSettingFragmentNavigationProvider(arg: SettingsFragmentNavigationProviderImpl): SettingsFragmentNavigationProvider
    }
}