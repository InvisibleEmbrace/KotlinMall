package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable


/**
 * Created by Administrator on 2018/2/12/012.
 */

interface UserApi {

    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>

}