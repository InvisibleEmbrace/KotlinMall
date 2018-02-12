package com.kotlin.base.data.protocol

/**
 * Created by Administrator on 2018/2/11/011.
 */
class BaseResp<out T>(val status: Int, val message: String, val data: T) {
}