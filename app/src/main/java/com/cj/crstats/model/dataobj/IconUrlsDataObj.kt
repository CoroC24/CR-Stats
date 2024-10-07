package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class IconUrlsDataObj(

    @SerializedName("medium")
    @Expose
    val medium: String?
)
