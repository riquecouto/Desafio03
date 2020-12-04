package com.example.desafio03

import com.example.desafio03.comics.Comics
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("comics?characters=1009610&limit=14&ts=1&apikey=6eb7e8896ec5850c52515a8a23ee97f0&hash=40a3aa568bb269dfad85ae0c4a297181")
    suspend fun getComicsRepo(
        @Query("offset") offset: Int
    ): Comics
}

const val urlApiMarvel = "https://gateway.marvel.com:443/v1/public/"

val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(urlApiMarvel)
    .build()

val webService: WebService = retrofit.create(WebService::class.java)