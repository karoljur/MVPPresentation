package com.example.mvppresentation.architecture

abstract class BasePresenter<out V : BaseContract.BaseView>(protected val view: V) : BaseContract.Presenter 