package com.example.faidnawa.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToast.setOnClickListener{ v-> Toast.makeText(this,"ini toas",Toast.LENGTH_SHORT).show()}
        button_count.setOnClickListener{
            count++
            show_count.text=count.toString()
        }
    }
}
