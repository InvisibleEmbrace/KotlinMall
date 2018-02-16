package com.kotlin.base.widgets

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.Gravity
import android.widget.ImageView
import com.kotlin.base.R

/**
 * Created by Administrator on 2018/2/15/015.
 */
class ProgressLoading private constructor(context: Context, theme: Int) : Dialog(context, theme) {

    companion object {
        private lateinit var mDialog: ProgressLoading
        private var animationDrawable: AnimationDrawable? = null

        fun create(context: Context): ProgressLoading {
            mDialog = ProgressLoading(context, R.style.LightDialog)
            //设置视图
            mDialog.setContentView(R.layout.progress_dialog)
            //设置点击屏幕外可取消
            mDialog.setCancelable(true)
            //设置点击取消，可以通过back键控制
            mDialog.setCanceledOnTouchOutside(false)
            //显示在屏幕中间
            mDialog.window.attributes.gravity = Gravity.CENTER
            //设置灰暗程度
            val lp = mDialog.window.attributes
            lp.dimAmount = 0.2f

            mDialog.window.attributes = lp

            //动画
            val loadingView = mDialog.findViewById<ImageView>(R.id.iv_loading)
            animationDrawable = loadingView.background as AnimationDrawable
            return mDialog
        }
    }

    fun showLoading() {
        //显示
        super.show()
        //开始
        animationDrawable?.start()
    }

    fun hideLoading() {
        //隐藏
        super.dismiss()
        //停止
        animationDrawable?.stop()
    }

}