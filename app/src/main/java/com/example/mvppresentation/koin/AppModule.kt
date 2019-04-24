package com.example.mvppresentation.koin

import com.example.mvppresentation.ui.SplashContract
import com.example.mvppresentation.ui.SplashPresenter
import org.koin.dsl.module.module

val appModule = module {
    factory<SplashContract.Presenter> { (view: SplashContract.View) -> SplashPresenter(view) }
}