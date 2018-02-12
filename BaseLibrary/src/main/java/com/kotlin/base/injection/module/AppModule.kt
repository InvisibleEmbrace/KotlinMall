package com.kotlin.base.injection.module

import android.content.Context
import com.kotlin.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/2/12/012.
 */
@Module
@Singleton
class AppModule(private val content: BaseApplication) {

    @Provides
    fun providesContext(): Context {
        return content
    }
}