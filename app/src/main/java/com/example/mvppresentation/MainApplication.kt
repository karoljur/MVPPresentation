package com.example.mvppresentation

import android.app.Application
import com.example.mvppresentation.extensions.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }
}