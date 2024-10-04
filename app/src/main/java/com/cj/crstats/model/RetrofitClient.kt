package com.cj.crstats.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://api.clashroyale.com/v1/"
    public const val API_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImQxY2I2YTM0LWY2YjctNGFlNy1hNjc3LTMyYjY2ZTVjMDUyYyIsImlhdCI6MTcyODA2MTQxMywic3ViIjoiZGV2ZWxvcGVyLzBhOTYyNGE5LTc0NzItN2NjMC0xZWY0LTFlNTFkNDhiZDlmNyIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyIyNTUuMjU1LjI1NS4wIl0sInR5cGUiOiJjbGllbnQifV19.XPhr85DWjOBHYCkweMLWqnVSo8lgtSxrWzQtx18fB6jFkTnPO1E2k4jUKPIschh1rlhLZaPkSgA5wjWpB0pkCg"

    val instance: CRApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(CRApiService::class.java)
    }
}