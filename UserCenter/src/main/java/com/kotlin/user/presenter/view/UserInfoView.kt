package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView
import com.kotlin.user.data.protocol.UserInfo

/**
 * Created by Administrator on 2018/2/18/018.
 */
interface UserInfoView : BaseView {

    fun onUserInfoResult(result: String)

    /*
      获取上传凭证回调
   */
    fun onGetUploadTokenResult(result:String)

}