package ru.kravchenkoanatoly.weatherapp.mainscreenfeature

import ru.kravchenkoanatoly.common.NavCommand

interface MainFragmentNavigationProvider {
    fun goToDetailFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}