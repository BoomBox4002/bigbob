package com.example.bigbob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        object:CountDownTimer(1500,1000){
            override fun onTick(p0:Long) {

            }

            override fun onFinish() {
                val intent = Intent( this@LaunchScreen, bigbob2::class.java)
                startActivity(intent)
                this@LaunchScreen.finish()

            }

        }.start()
    }
}