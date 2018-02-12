package com.kotlin.base.common

import android.app.Application
import com.kotlin.base.injection.component.AppComponent
import com.kotlin.base.injection.component.DaggerAppComponent
import com.kotlin.base.injection.module.AppModule

/**
 * Created by Administrator on 2018/2/12/012.
 */
open class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}