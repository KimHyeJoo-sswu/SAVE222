package com.database.save222

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar!!.setDisplayHomeAsUpEnabled(true) // 왼쪽 버튼 사용설정
        supportActionBar!!.setDisplayShowTitleEnabled(true) // 타이틀 보이게

        val record_btn = findViewById<Button>(R.id.record_btn)

        record_btn.setOnClickListener{
            startActivity(Intent(this, RecordActivity::class.java))
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}