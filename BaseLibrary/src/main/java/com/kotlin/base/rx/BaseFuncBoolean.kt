package com.kotlin.base.rx

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.exception.BaseException
import rx.Observable
import rx.functions.Func1


/**
 * Created by Administrator on 2018/2/12/012.
 */
class BaseFuncBoolean<T> : Func1<BaseResp<T>, Observable<Boolean>> {

    override fun call(t: BaseResp<T>): Observable<Boolean> {
        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))
        }
        return Observable.just(true)
    }

}