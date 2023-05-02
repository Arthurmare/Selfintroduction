package com.example.selfintroduction

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var txv:TextView
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        txv.setTextColor(Color.parseColor("#eeee00"))

    }

    fun introduce(v:View){
        btn = findViewById(R.id.btn)
        val intent = Intent(this,IntroduceActivity::class.java)
        startActivity(intent)
    }
}