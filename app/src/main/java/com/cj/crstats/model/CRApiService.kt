package com.cj.crstats.model

import com.cj.crstats.model.dataobj.PlayerDataObj
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CRApiService {

    /*@GET("players/{playerTag}")
    fun getPlayerInfo(@Header("Authorization") authorization: String, @Path("playerTag") playerTag: String) : Call<List<PlayerDataObj>>*/

    @GET("players/{playerTag}")
    fun getPlayerInfo(@Path("playerTag") playerTag: String) : Call<PlayerDataObj>

}