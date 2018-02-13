package com.kotlin.user.service.impl

import android.os.Build.VERSION_CODES.O
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.exception.BaseException
import com.kotlin.base.ext.convertBoolean
import com.kotlin.base.rx.BaseFuncBoolean
import com.kotlin.user.repository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.Observer
import rx.functions.Func1
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/11/011.
 */
class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {

        return repository.register(mobile, pwd, verifyCode).convertBoolean()

    }

}