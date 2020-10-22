package com.example.android.cocktailapp.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://www.thecocktaildb.com"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface CocktailApiService {
    @GET("api/json/v1/1/filter.php?a=Alcoholic")
    suspend fun getCocktails(): NetworkCocktailsContainer

    @GET("api/json/v1/1/lookup.php")
    suspend fun getCocktailDetails(@Query("i") cocktailId: Long ) : DrinksDetails

    @GET("api/json/v1/1/lookup.php?i=11007")
    suspend fun getCocktailDetails1() : DrinksDetails
}

object CocktailApi{
    val retrofitService: CocktailApiService by lazy {
        retrofit.create(CocktailApiService::class.java)
    }
}