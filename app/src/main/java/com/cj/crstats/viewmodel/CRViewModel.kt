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

    private val _playerInfo = MutableLiveData<List<PlayerDataObj>>()
    val playerInf: LiveData<List<PlayerDataObj>> get() = _playerInfo

    fun fetchPlayerInfo(context: Context) {
        try {
            RetrofitClient.instance.getPlayerInfo("Bearer ${RetrofitClient.API_KEY}", "#8PY0YJ0YG").enqueue(object :
                Callback<List<PlayerDataObj>> {
                override fun onResponse(call: Call<List<PlayerDataObj>>, response: Response<List<PlayerDataObj>>) {
                    if (response.isSuccessful) {
                        _playerInfo.value = response.body()
                    }
                }

                override fun onFailure(call: Call<List<PlayerDataObj>>, t: Throwable) {
                    Toast.makeText(context, "Error al obtener la información del jugador $t", Toast.LENGTH_LONG)
                        .show()
                }

            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}