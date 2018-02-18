package com.kotlin.user.injection.component

import com.kotlin.base.injection.PreComponentScope
import com.kotlin.base.injection.component.ActivityComponent
import com.kotlin.base.injection.module.ActivityModule
import com.kotlin.user.injection.module.UserModule
import com.kotlin.user.ui.activity.LoginActivity
import com.kotlin.user.ui.activity.RegisterActivity
import dagger.Component

/**
 * Created by Administrator on 2018/2/12/012.
 */
@PreComponentScope
@Component(dependencies = [(ActivityComponent::class)], modules = [(UserModule::class)])
interface UserComponent {

    fun inject(activity: RegisterActivity)

    fun inject(activity: LoginActivity)
}