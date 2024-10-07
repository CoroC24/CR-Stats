package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BadgeDataObj(

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("level")
    @Expose
    val level: Int,

    @SerializedName("maxLevel")
    @Expose
    val maxLevel: Int,

    @SerializedName("progress")
    @Expose
    val progress: Int,

    @SerializedName("target")
    @Expose
    val target: Int,

    @SerializedName("iconUrls")
    @Expose
    val iconUrls: IconUrlsDataObj
)
