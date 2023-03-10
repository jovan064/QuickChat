package com.example.quickchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        login.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}