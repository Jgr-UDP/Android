package com.example.userkotlin

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class VerifyEmail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.verify_email)
        val window = this.window
        with(window) {
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }
        window.statusBarColor = this.resources.getColor(R.color.colorBlue)


    }
}

