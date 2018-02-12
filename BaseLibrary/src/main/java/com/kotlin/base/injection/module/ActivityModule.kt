package com.kotlin.base.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/2/12/012.
 */
@Module
@Singleton
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesActivity(): Activity {
        return activity
    }
}