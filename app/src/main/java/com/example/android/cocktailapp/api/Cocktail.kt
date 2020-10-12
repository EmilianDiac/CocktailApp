package com.example.android.cocktailapp.api

import com.squareup.moshi.Json

data class Cocktail (
        @Json(name = "strDrink") val name: String,
        @Json(name = "strDrinkThumb") val imageUrl: String,
        @Json(name = "idDrink") val cocktailId: Long
)

data class DrinksList(@Json(name = "drinks") val list: List<Cocktail>)