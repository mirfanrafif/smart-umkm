package com.mirfanrafif.smartumkm

import android.app.Application
import com.mirfanrafif.smartumkm.core.CoreComponent
import com.mirfanrafif.smartumkm.core.DaggerCoreComponent

class MyApplication: Application() {
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}