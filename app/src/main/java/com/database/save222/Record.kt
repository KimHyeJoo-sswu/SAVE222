package com.database.save222

import com.google.gson.annotations.SerializedName

data class Record(
    @SerializedName(value = "userName") var userName: String,
    @SerializedName(value = "childName") var childName: String,
    @SerializedName(value = "date") var date: String,
    @SerializedName(value = "decibel") var decibel: Int,
    @SerializedName(value = "location") var location: String
)
