package com.example.android.cocktailapp

import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.database.FavoriteCocktail

fun List<FavoriteCocktail>.toCocktail(): MutableList<Cocktail> {
    val list = mutableListOf<Cocktail>()
    for (favoriteCocktail in this) {
        val cocktail = Cocktail(
            name = favoriteCocktail.name,
            imageUrl = favoriteCocktail.imageUrl.replace("\\","" ),
            cocktailId = favoriteCocktail.cocktailId
        )
        list.add(cocktail)
    }
    return list
}