package com.chendaole.kotlinmusicplayer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.chendaole.kotlinmusicplayer.controller.service.MusicService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvent()
    }

    private fun initEvent() {
        val btnStart = findViewById<Button>(R.id.btn_start)
        btnStart.setOnClickListener{
            handleOnClickBtnStart()
        }
    }

    private fun handleOnClickBtnStart() {
        val intent = Intent(this@MainActivity, MusicService::class.java)
        startService(intent)
    }
}
