package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ClanDataObj(

    @SerializedName("tag")
    @Expose
    val tag: String,

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("badgeId")
    @Expose
    val badgeId: Int
)
