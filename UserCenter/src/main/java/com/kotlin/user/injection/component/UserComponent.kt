package com.kotlin.user.injection.component

import com.kotlin.base.injection.PreComponentScope
import com.kotlin.base.injection.component.ActivityComponent
import com.kotlin.base.injection.module.ActivityModule
import com.kotlin.user.injection.module.UploadModule
import com.kotlin.user.injection.module.UserModule
import com.kotlin.user.ui.activity.*
import dagger.Component

/**
 * Created by Administrator on 2018/2/12/012.
 */
@PreComponentScope
@Component(dependencies = [(ActivityComponent::class)], modules = [(UserModule::class),(UploadModule::class)])
interface UserComponent {

    fun inject(activity: RegisterActivity)

    fun inject(activity: LoginActivity)

    fun inject(activity: ForgetPwdActivity)

    fun inject(activity: ResetPwdActivity)

    fun inject(activity: UserInfoActivity)
}