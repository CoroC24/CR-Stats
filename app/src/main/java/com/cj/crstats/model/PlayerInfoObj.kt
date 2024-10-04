package com.cj.crstats.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlayerInfoObj(

    @SerializedName("tag")
    @Expose
    val tag: String,

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("expLevel")
    @Expose
    val expLevel: Int,

    @SerializedName("trophies")
    @Expose
    val trophies: Int,
)
