package com.example.android.cocktailapp.manualDependencyInjection

import android.app.Application
import android.content.Context


class MyApplication : Application() {
    lateinit var appContainer: AppContainer

    override fun onCreate() {
        super.onCreate()
        appContainer = AppContainer(this as Context)
    }


}