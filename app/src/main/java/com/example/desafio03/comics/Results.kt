package com.example.desafio03.comics

import com.google.gson.annotations.SerializedName

data class Results(

    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("pageCount") val pageCount: Int,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("dates") val dates: List<Dates>,
    @SerializedName("prices") val prices: List<Prices>,
    @SerializedName("thumbnail") val thumbnail: Thumbnail,
)