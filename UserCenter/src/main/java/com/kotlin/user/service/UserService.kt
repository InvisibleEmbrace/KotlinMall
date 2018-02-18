package com.kotlin.user.service

import com.kotlin.user.data.protocol.UserInfo
import rx.Observable

/**
 * Created by Administrator on 2018/2/11/011.
 */
interface UserService {

    /**
     * 注册
     */
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean>

    fun login(mobile: String, pwd: String, pushId: String): Observable<UserInfo>
}