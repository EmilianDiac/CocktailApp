package com.example.android.cocktailapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.database.FavoriteCocktail
import com.example.android.cocktailapp.database.FavoritesDAO

class CocktailRepository(private val favoritesDAO: FavoritesDAO) {

    val favoriteCocktails: LiveData<MutableList<FavoriteCocktail>> = favoritesDAO.getAllFavoriteCocktails()

    suspend fun insert(cocktail: Cocktail) {
        val newFavoriteCocktail = FavoriteCocktail(cocktail.name, cocktail.imageUrl, cocktail.cocktailId)
        favoritesDAO.insert(newFavoriteCocktail);
        val x = 1
    }
}