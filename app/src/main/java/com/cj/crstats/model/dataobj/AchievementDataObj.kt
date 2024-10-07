package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AchievementDataObj(

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("stars")
    @Expose
    val stars: Int,

    @SerializedName("value")
    @Expose
    val value: Int,

    @SerializedName("target")
    @Expose
    val target: Int,

    @SerializedName("info")
    @Expose
    val info: String,

    @SerializedName("completionInfo")
    @Expose
    val completionInfo: String?
)
