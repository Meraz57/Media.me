package com.example.mediame

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitClient {

    companion object {

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://conduit.productionready.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiinterface = retrofit.create(API::class.java)

    }

}