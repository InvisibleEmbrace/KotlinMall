package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.*
import rx.Observable
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/12/012.
 */
class UserRepository @Inject constructor() {

    /**
     * 注册
     */
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile, pwd, verifyCode))
    }

    /**
     * 登录
     */
    fun login(mobile: String, pwd: String, pushId: String): Observable<BaseResp<UserInfo>> {
        return RetrofitFactory.instance.create(UserApi::class.java).login(LoginReq(mobile, pwd, pushId))
    }

    /**
     * 忘记密码
     */
    fun forgetPwd(mobile: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).forgetPwd(ForgetPwdReq(mobile, verifyCode))
    }

    /**
     * 重置密码
     */
    fun resetPwd(mobile: String, pwd: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).resetPwd(ResetPwdReq(mobile, pwd))
    }
}