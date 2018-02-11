package com.kotlin.base.rx

import rx.Subscriber

/**
 * Created by Administrator on 2018/2/11/011.
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {

    }

    override fun onError(e: Throwable?) {

    }
}