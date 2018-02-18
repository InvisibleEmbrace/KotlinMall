package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.data.protocol.UserInfo
import com.kotlin.user.presenter.view.LoginView
import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/18/018.
 */
class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    /**
     * 注册
     */
    fun login(mobile: String, pwd: String, pushId: String) {
        //检查网络
        if (!checkNetWork()) {
            return
        }
        //显示加载对话框
        mView.showLoading()
        userService.login(mobile, pwd, pushId)
                .execute(object : BaseSubscriber<UserInfo>(mView) {
                    override fun onNext(t: UserInfo) {
                        mView.onLoginResult(t)
                    }
                }, lifecycleProvider)
    }

}