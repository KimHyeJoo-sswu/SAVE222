package com.database.save222

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthRetrofitInterface {
    @POST ("/accident")
    fun record (@Body record:Record): Call<AuthResponse>
}