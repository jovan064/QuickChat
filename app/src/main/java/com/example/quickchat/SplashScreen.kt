package com.example.quickchat

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)  //Setting up the phone to be in fullscreen

        val typeface: Typeface = Typeface.createFromAsset(assets, "myfont.ttf")
        splash_screen_font.typeface = typeface
        Log.d("Custom Font", "Loaded font: $typeface")


        Handler().postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
            finish() },2500) //this will send user from SplashActivity Intro Activity

    }
}