package com.example.rrlib

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RRActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rractivity)
    }
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, RRActivity::class.java)
            context.startActivity(intent)
        }
    }
}