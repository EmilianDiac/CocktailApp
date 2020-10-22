package com.example.android.cocktailapp.api

import com.example.android.cocktailapp.database.DatabaseCocktail
import com.example.android.cocktailapp.domain.DomainCocktail
import com.squareup.moshi.Json

data class NetworkCocktailsContainer(@Json(name = "drinks") val list: MutableList<NetworkCocktail>)

data class NetworkCocktail (
    @Json(name = "strDrink") val name: String,
    @Json(name = "strDrinkThumb") var imageUrl: String,
    @Json(name = "idDrink") val cocktailId: Long
)

fun NetworkCocktailsContainer.asDomainCocktail(): List<DomainCocktail> {
    return list.map {
        DomainCocktail(
            name = it.name,
            id = it.cocktailId,
            imageUrl = it.imageUrl,
            isFavorite = false
        )
    }
}

fun NetworkCocktailsContainer.asDatabaseCocktail(): List<DatabaseCocktail> {
    return list.map {
        DatabaseCocktail(
            name = it.name,
            cocktailId = it.cocktailId,
            imageUrl = it.imageUrl
        )
    }
}


