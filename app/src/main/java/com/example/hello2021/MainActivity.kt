package com.example.hello2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.setText("嗨，我是陳昱丰");


    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "tcyangpu修改螢幕觸控"
        return true
    }

}