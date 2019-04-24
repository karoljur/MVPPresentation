package com.example.mvppresentation.architecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope

abstract class BaseFragment<P : BasePresenter<BaseContract.BaseView>> : Fragment(), CoroutineScope, BaseContract.BaseView {
    protected abstract val layoutId: Int
    abstract val presenter: P

    @CallSuper
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            : View = inflater.inflate(layoutId, container, false)
}