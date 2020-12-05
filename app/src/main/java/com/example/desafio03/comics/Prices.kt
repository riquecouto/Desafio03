package com.example.desafio03.comics
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prices (

	@SerializedName("type") val type : String,
	@SerializedName("price") val price : Double
) : Parcelable