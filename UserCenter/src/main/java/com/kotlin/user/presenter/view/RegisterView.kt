package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView

/**
 * Created by Administrator on 2018/2/11/011.
 */
interface RegisterView : BaseView {

    fun onRegisterResult(result: String)
}