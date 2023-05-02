package com.example.selfintroduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.View
import android.widget.Button
import android.widget.TextView

class IntroduceActivity : AppCompatActivity() {

    lateinit var btn2:Button
    lateinit var txv2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myintroduce)



    }

    fun myhobby(v: View){
        btn2 = findViewById(R.id.btn2)
        txv2 = findViewById(R.id.txv2)

        txv2.text = "我的名字:陳宥樺\n"+
                    "就讀於:靜宜大學資工二A\n"+
                    "興趣是:寫程式"

    }
}


