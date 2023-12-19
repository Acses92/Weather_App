package ru.kravchenkoanatoly.weatherapp.detailscreenfeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import ru.kravchenkoanatoly.common.BaseFragment
import ru.kravchenkoanatoly.weatherapp.R


@AndroidEntryPoint
class DetailFragment : BaseFragment(R.layout.fragment_detail) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
}