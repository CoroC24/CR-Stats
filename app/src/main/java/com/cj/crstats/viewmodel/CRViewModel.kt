package com.cj.crstats.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cj.crstats.model.CRApiService
import com.cj.crstats.model.PlayerInfoObj
import com.cj.crstats.model.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CRViewModel : ViewModel() {

    private val _playerInfo = MutableLiveData<List<PlayerInfoObj>>()
    val playerInf: LiveData<List<PlayerInfoObj>> get() = _playerInfo

    fun fetchPlayerInfo(context: Context) {
        try {
            RetrofitClient.instance.getPlayerInfo("Bearer ${RetrofitClient.API_KEY}", "#8PY0YJ0YG").enqueue(object :
                Callback<List<PlayerInfoObj>> {
                override fun onResponse(call: Call<List<PlayerInfoObj>>, response: Response<List<PlayerInfoObj>>) {
                    if (response.isSuccessful) {
                        _playerInfo.value = response.body()
                    }
                }

                override fun onFailure(call: Call<List<PlayerInfoObj>>, t: Throwable) {
                    Toast.makeText(context, "Error al obtener la información del jugador $t", Toast.LENGTH_LONG)
                        .show()
                }

            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}