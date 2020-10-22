package com.example.android.cocktailapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.android.cocktailapp.api.CocktailApi
import com.example.android.cocktailapp.api.asDatabaseCocktail
import com.example.android.cocktailapp.database.DatabaseCocktail
import com.example.android.cocktailapp.database.CocktailDAO
import com.example.android.cocktailapp.database.asDomainCocktail
import com.example.android.cocktailapp.domain.DomainCocktail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CocktailRepository(private val cocktailDAO: CocktailDAO) {

    val cocktailsList: LiveData<List<DomainCocktail>> = Transformations.map(cocktailDAO.getAllCocktails()) {
        it.asDomainCocktail()
    }

    val favoriteCocktails: LiveData<List<DomainCocktail>> = Transformations.map(cocktailDAO.getFavoriteCocktails()) {
        it.asDomainCocktail()
    }

    suspend fun addToFavorite(cocktail: DomainCocktail) {
        val newFavoriteCocktail = DatabaseCocktail(cocktail.name, cocktail.imageUrl, cocktail.id, true)
        cocktailDAO.markAsFavorite(newFavoriteCocktail);
    }

    suspend fun refreshCocktailList() {
        withContext(Dispatchers.IO) {
            val cocktailList = CocktailApi.retrofitService.getCocktails().asDatabaseCocktail()
            cocktailDAO.insertAll(cocktailList = cocktailList)
        }
    }
}