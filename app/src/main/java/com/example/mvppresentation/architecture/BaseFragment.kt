package com.example.mvppresentation.architecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope

abstract class BaseFragment : Fragment(), CoroutineScope {
    protected abstract val layoutId: Int
    abstract val presenter: BasePresenter

    @CallSuper
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(layoutId, container, false)

}