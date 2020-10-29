package com.example.android.cocktailapp.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.database.CocktailRoomDatabase
import com.example.android.cocktailapp.database.FavoriteCocktail
import com.example.android.cocktailapp.repository.CocktailRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FavoritesViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: CocktailRepository
    val favoriteCocktailsList: LiveData<MutableList<FavoriteCocktail>>

    init {
        val favoritesDAO =
            CocktailRoomDatabase.getDatabase(application, viewModelScope).favoritesDao()
        repository = CocktailRepository(favoritesDAO)
        favoriteCocktailsList = repository.favoriteCocktails
        val x = 1
    }

    fun insert(cocktail: Cocktail) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(cocktail)
    }
}