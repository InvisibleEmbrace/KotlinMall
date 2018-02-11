package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * Created by Administrator on 2018/2/11/011.
 */
open class BasePresenter<T : BaseView> {

    lateinit var mView: T

}