package com.cornershopapp.testdaggerhilt

import android.app.Application
import com.cornershopapp.testdaggerhilt.di.AppComponent
import com.cornershopapp.testdaggerhilt.di.DaggerAppComponent

open class TestDaggerApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}
