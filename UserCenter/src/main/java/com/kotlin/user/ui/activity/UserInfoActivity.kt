package com.kotlin.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.presenter.UserInfoPresenter
import com.kotlin.user.presenter.view.UserInfoView
import com.bigkoo.alertview.AlertView
import android.widget.Toast
import com.bigkoo.alertview.OnItemClickListener
import org.jetbrains.anko.toast


class UserInfoActivity : BaseMvpActivity<UserInfoPresenter>(), UserInfoView, View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        initView()
    }

    private fun initView() {
        AlertView("上传头像", null, "取消", null,
                arrayOf("拍照", "从相册中选择"),
                this, AlertView.Style.ActionSheet, OnItemClickListener { o, position ->
            when (position) {
                0 -> toast("拍照")
                1 -> toast("相册")
            }
        }).show()
    }

    override fun injectionComponent() {

    }

    override fun onClick(view: View) {

    }

    override fun onUserInfoResult(result: String) {

    }
}
