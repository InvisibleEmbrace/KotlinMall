package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.ResetPwdView
import com.kotlin.user.presenter.view.UserInfoView
import com.kotlin.user.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/18/018.
 */
class UserInfoPresenter @Inject constructor() : BasePresenter<UserInfoView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    fun userInfo(mobile: String, pwd: String) {
        //检查网络
        if (!checkNetWork()) {
            return
        }
        //显示加载对话框
        mView.showLoading()


    }
}