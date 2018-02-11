package com.kotlin.user.service

import rx.Observable

/**
 * Created by Administrator on 2018/2/11/011.
 */
interface UserService {

    fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean>
}