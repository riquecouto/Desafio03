package com.example.desafio03.comics
import com.google.gson.annotations.SerializedName

data class Prices (

	@SerializedName("type") val type : String,
	@SerializedName("price") val price : Double
)