package com.kotlin.base.rx

import com.kotlin.base.exception.BaseException
import com.kotlin.base.presenter.view.BaseView
import rx.Subscriber

/**
 * Created by Administrator on 2018/2/11/011.
 */
open class BaseSubscriber<T>(private val baseView: BaseView) : Subscriber<T>() {

    override fun onNext(t: T) {

    }

    override fun onCompleted() {
        baseView.hideLoading()
    }

    override fun onError(e: Throwable?) {
        baseView.hideLoading()
        if (e is BaseException) {
            baseView.onError(e.msg)

        }
    }
}