package com.example.bigbob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bigbob2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bigbob2)

        val tvBtn: TextView = findViewById(R.id.tvBtn)// хуец
        tvBtn.setOnClickListener{
            val intent = Intent(this@bigbob2, bigbob3::class.java)
            startActivity(intent)
            this@bigbob2.finish()


        }



    }
}