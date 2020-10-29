package com.example.android.cocktailapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailApiService {
    @GET("api/json/v1/1/filter.php?a=Alcoholic")
    suspend fun getCocktails(): NetworkCocktailsContainer

    @GET("api/json/v1/1/lookup.php")
    suspend fun getCocktailDetails(@Query("i") cocktailId: Long ) : DrinksDetails

}