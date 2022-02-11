package com.example.mediame

import retrofit2.Call
import retrofit2.http.GET


interface API {

    @GET ("articles")
    fun getarticles():Call<Myarticles>


}