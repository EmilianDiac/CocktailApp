package com.example.android.cocktailapp.api

import com.squareup.moshi.Json

data class CocktailDetails(
    @Json(name = "strDrinkThumb") val cocktailImageUrl: String,
    @Json(name = "strDrink") val cocktailName: String,
    @Json(name = "strCategory") val cocktailCategory: String,
    @Json(name = "strGlass") val cocktailGlassType: String,
    val strIngredient1: String?,
    val strIngredient2: String?,
    val strIngredient3: String?,
    val strIngredient4: String?,
    val strIngredient5: String?,
    val strIngredient6: String?,
    val strIngredient7: String?,
    val strIngredient8: String?,
    val strIngredient9: String?,
    val strIngredient10: String?,
    val strIngredient11: String?,
    val strIngredient12: String?,
    val strIngredient13: String?,
    val strIngredient14: String?,
    val strIngredient15: String?

) {
    val cocktailIngredielntsList = listOfNotNull<String>(strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11, strIngredient12, strIngredient13, strIngredient14, strIngredient15)
}

data class DrinksDetails(@Json(name = "drinks") val details: List<CocktailDetails>)