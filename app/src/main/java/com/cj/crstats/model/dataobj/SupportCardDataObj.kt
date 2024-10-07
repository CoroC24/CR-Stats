package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SupportCardDataObj(

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("id")
    @Expose
    val id: Int,

    @SerializedName("level")
    @Expose
    val level: Int,

    @SerializedName("maxLevel")
    @Expose
    val maxLevel: Int,

    @SerializedName("rarity")
    @Expose
    val rarity: String,

    @SerializedName("count")
    @Expose
    val count: Int,

    @SerializedName("iconUrls")
    @Expose
    val iconUrls: IconUrlsDataObj
)
