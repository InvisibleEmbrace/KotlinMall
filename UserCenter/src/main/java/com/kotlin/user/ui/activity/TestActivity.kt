package com.kotlin.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.user.R
import org.jetbrains.anko.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        verticalLayout {
            padding = 30
            editText {
                hint = "username"
            }
            editText {
                hint = "password"
            }
            button {
                text = "login"
            }
        }
    }
}
