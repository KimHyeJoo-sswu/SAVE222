package com.database.save222

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.database.save222.databinding.ActivityRecordBinding


class RecordActivity : AppCompatActivity(), RecordResult {
    lateinit var binding: ActivityRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveBtn.setOnClickListener{
            save()
            startMainActivity()
        }
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
        if (binding.userNameEt.text.toString().isEmpty()) {
            Toast.makeText(this, "사용자 이름을 입력해주세요.", Toast.LENGTH_SHORT).show()
            return
        }
        if (binding.childNameEt.text.toString().isEmpty()) {
            Toast.makeText(this, "아이 이름을 입력해주세요.", Toast.LENGTH_SHORT).show()
            return
        }
        if (binding.dateEt.text.toString().isEmpty()) {
            Toast.makeText(this, "날짜를 입력해주세요.", Toast.LENGTH_SHORT).show()
            return
        }
        if (binding.decibelEt.text.toString().isEmpty()) {
            Toast.makeText(this, "데시벨을 입력해주세요.", Toast.LENGTH_SHORT).show()
            return
        }

        if (binding.locationEt.text.toString().isEmpty()) {
            Toast.makeText(this, "예상 발생 장소를 입력해주세요.", Toast.LENGTH_SHORT).show()
            return
        }

        val authService = AuthService()
        authService.record(getRecord())
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun recordSuccess() {
        finish()
    }

    override fun recordFailure() {
        Toast.makeText(this, "기록을 실패했습니다.", Toast.LENGTH_SHORT).show()
    }

}