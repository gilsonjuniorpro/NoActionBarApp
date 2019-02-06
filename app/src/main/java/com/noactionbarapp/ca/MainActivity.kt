package com.noactionbarapp.ca

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btGo.setOnClickListener{ callSecondActivity() }
    }

    private fun callSecondActivity() {
        val it = Intent(this, TwoActivity::class.java)
        startActivity(it)
    }
}
