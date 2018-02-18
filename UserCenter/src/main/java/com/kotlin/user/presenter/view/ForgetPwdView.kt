package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView
import com.kotlin.user.data.protocol.UserInfo

/**
 * Created by Administrator on 2018/2/18/018.
 */
interface ForgetPwdView : BaseView {

    fun onForgetPwdResult(result: String)

}