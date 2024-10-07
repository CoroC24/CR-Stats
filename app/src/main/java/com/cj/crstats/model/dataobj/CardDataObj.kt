package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CardDataObj(

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

    @SerializedName("elixirCost")
    @Expose
    val elixirCost: Int,

    @SerializedName("iconUrls")
    @Expose
    val iconUrls: IconUrlsDataObj
)
