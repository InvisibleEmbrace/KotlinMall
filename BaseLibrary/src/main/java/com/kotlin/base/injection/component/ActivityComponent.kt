package com.kotlin.base.injection.component

import android.app.Activity
import com.kotlin.base.injection.ActivityScope
import com.kotlin.base.injection.module.ActivityModule
import dagger.Component

/**
 * Created by Administrator on 2018/2/12/012.
 */
@ActivityScope
@Component(dependencies = [(AppComponent::class)],modules = [(ActivityModule::class)])
interface ActivityComponent {

    fun activity(): Activity
}