package com.kotlin.base.injection.module

import android.content.Context
import com.kotlin.base.common.BaseApplication
import com.kotlin.base.common.BaseApplication.Companion.context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/2/12/012.
 */
@Module
@Singleton
class AppModule(private val context: BaseApplication) {

    @Provides
    fun providesContext(): Context {
        return context
    }
}