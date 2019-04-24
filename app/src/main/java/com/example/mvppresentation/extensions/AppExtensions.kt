package com.example.mvppresentation.extensions

import com.example.mvppresentation.MainApplication
import com.example.mvppresentation.koin.appModule
import org.koin.android.ext.android.startKoin

fun MainApplication.startKoin(): Unit = startKoin(this, listOf(appModule))
