package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/11/011.
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService: UserServiceImpl

    fun register(mobile: String, pwd: String, verifyCode: String) {
        userService.register(mobile, pwd, verifyCode)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        if (t) {
                            mView.onRegisterResult("注册成功")
                        }
                    }
                }, lifecycleProvider)

    }
}