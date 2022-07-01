package com.database.save222

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.database.save222.databinding.ActivityRecordBinding
import retrofit2.Call
import retrofit2.Callback

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

//    private fun save() {
//
//        val authService = getRetrofit().create(RetrofitInterface::class.java)
//        authService.record(getRecord()).enqueue(object: Callback<Response> {
//            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
//                Log.d("RECORD/SUCCESS",response.toString())
//                val resp: Response = response.body()!!
//
//                when(resp.code){
//                    1000->finish()
//
//                }
//            }
//
//            override fun onFailure(call: Call<Response>, t: Throwable) {
//                Log.d("RECORD/FAILURE",t.message.toString())
//            }
//        })
//
//    }

}