package ru.kravchenkoanatoly.weatherApp.common_android

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes private val layoutRes: Int): Fragment(layoutRes) {

}