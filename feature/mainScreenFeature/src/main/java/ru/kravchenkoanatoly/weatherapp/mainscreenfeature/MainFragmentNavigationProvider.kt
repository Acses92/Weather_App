package ru.kravchenkoanatoly.weatherApp.mainscreenfeature

import ru.kravchenkoanatoly.common.NavCommand

interface MainFragmentNavigationProvider {
    fun goToDetailFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}