package com.example.android.cocktailapp

import com.example.android.cocktailapp.api.NetworkCocktail
import com.example.android.cocktailapp.database.DatabaseCocktail

fun List<DatabaseCocktail>.toCocktail(): MutableList<NetworkCocktail> {
    val list = mutableListOf<NetworkCocktail>()
    for (favoriteCocktail in this) {
        val cocktail = NetworkCocktail(
            name = favoriteCocktail.name,
            imageUrl = favoriteCocktail.imageUrl.replace("\\","" ),
            cocktailId = favoriteCocktail.cocktailId
        )
        list.add(cocktail)
    }
    return list
}