package ru.kravchenkoanatoly.weatherapp.mainfragment

import ru.kravchenkoanatoly.weatherApp.common_android.NavCommand

interface MainFragmentNavigationProvider {
    fun goToDetailFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}