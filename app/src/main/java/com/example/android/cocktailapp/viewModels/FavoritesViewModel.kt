package com.example.android.cocktailapp.viewModels

import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.cocktailapp.domain.DomainCocktail
import com.example.android.cocktailapp.repository.CocktailRepository

class FavoritesViewModel() : ViewModel() {

    var favoriteCocktailsList: LiveData<List<DomainCocktail>> = MutableLiveData<List<DomainCocktail>>()

    fun instantiateFavoritesCocktailList(repository: CocktailRepository) {
        favoriteCocktailsList = repository.favoriteCocktails
    }


}