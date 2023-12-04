package ru.kravchenkoanatoly.weatherapp.detailscreenfeature

import ru.kravchenkoanatoly.common.NavCommand

interface DetailFragmentNavigationProvider {
    fun goToMainFragment(): NavCommand

    fun goToSettingFragment(): NavCommand
}