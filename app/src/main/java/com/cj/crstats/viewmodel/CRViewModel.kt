package com.cj.crstats.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cj.crstats.model.dataobj.PlayerDataObj
import com.cj.crstats.model.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CRViewModel : ViewModel() {

    private val _playerInfo = MutableLiveData<PlayerDataObj>()
    val playerInf: LiveData<PlayerDataObj> get() = _playerInfo

    fun fetchPlayerInfo(context: Context, playerTag: String) {
        try {
            RetrofitClient.instance.getPlayerInfo(playerTag).enqueue(object :
                Callback<PlayerDataObj> {
                override fun onResponse(call: Call<PlayerDataObj>, response: Response<PlayerDataObj>) {
                    if (response.isSuccessful) {
                        _playerInfo.value = response.body()
                    }
                }

                override fun onFailure(call: Call<PlayerDataObj>, t: Throwable) {
                    Toast.makeText(context, "Error al obtener la información del jugador $t", Toast.LENGTH_LONG)
                        .show()
                    t.printStackTrace()
                }

            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
