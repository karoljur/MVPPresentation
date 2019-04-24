package com.example.mvppresentation.architecture

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<P: BasePresenter<BaseContract.BaseView>> : AppCompatActivity(), BaseContract.BaseView {
    protected lateinit var presenter: P
    protected abstract val layoutId: Int

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutId)
    }
}