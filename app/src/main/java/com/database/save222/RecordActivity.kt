package com.database.save222

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.database.save222.databinding.ActivityRecordBinding

class RecordActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getRecord(): Record {
        val userName: String = binding.userNameEt.text.toString()
        val childName: String = binding.childNameEt.text.toString()
        val date: String = binding.dateEt.text.toString()
        val decibel: Int = binding.decibelEt.text.toString().toInt()
        val location: String = binding.locationEt.text.toString()

        return Record(userName,childName,date,decibel,location)
    }

    private fun save() {

    }

}