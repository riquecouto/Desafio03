package com.example.desafio03.comics

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Results(

    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("pageCount") val pageCount: Int,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("dates") val dates: List<Dates>,
    @SerializedName("prices") val prices: List<Prices>,
    @SerializedName("thumbnail") val thumbnail: Thumbnail,
) : Parcelable