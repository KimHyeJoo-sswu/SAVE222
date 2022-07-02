package com.database.save222

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "서버 연결 주소"

fun getRetrofit(): Retrofit {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://eunhyun.shop:9000")
        .addConverterFactory(GsonConverterFactory.create()).build()
    return retrofit
}

