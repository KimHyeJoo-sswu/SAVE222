package com.database.save222

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthService {

    private lateinit var recordResult : RecordResult

    fun record(record: Record){
        val authService = getRetrofit().create(AuthRetrofitInterface::class.java)
        authService.record(record).enqueue(object: Callback<AuthResponse> {
            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                Log.d("RECORD/SUCCESS",response.toString())
                val resp: AuthResponse = response.body()!!
                when(resp.code){
                    1000 -> recordResult.recordSuccess()
                    else -> recordResult.recordFailure()
                }
            }

            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Log.d("RECORD/FAILURE",t.message.toString())
            }
        })

    }
}