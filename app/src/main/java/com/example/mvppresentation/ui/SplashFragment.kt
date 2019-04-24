package com.example.mvppresentation.ui

import com.example.mvppresentation.R
import com.example.mvppresentation.architecture.BaseFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf
import kotlin.coroutines.CoroutineContext

class SplashFragment : BaseFragment<SplashContract.Presenter>() {
    override val layoutId: Int = R.layout.fragment_splash
    override val presenter: SplashContract.Presenter by inject { parametersOf(this) }
    override val coroutineContext: CoroutineContext = Dispatchers.Main + SupervisorJob()
}