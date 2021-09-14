package com.diptendunandi.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var c:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.button)
        val txt:TextView=findViewById(R.id.textView)
        btn.setOnClickListener {
            c++
            txt.text="$c"
        }
        }
    }
