package com.example.android.cocktailapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.api.CocktailApi
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    val onFavoriteClicked = MutableLiveData<Boolean>(false)

    val favoriteCocktailToAdd = MutableLiveData<Cocktail>()

    val alcoholic = MutableLiveData<Boolean>()
    private val _drinks = MutableLiveData<MutableList<Cocktail>>()
    val drinks: LiveData<MutableList<Cocktail>>
        get() = _drinks

    //todo make a toast for error in activity
    private val _mainActivityToastMessage = MutableLiveData<String>()
    val mainActivityToastMessage: LiveData<String>
        get() = _mainActivityToastMessage

    init {
        alcoholic.value = false
        getCocktails()
//        favoriteCocktailList.value = mutableListOf<Cocktail>()
    }
    private fun getCocktails() {
        viewModelScope.launch {
            try {
                _drinks.value = CocktailApi.retrofitService.getCocktails().list
            } catch (e: Exception) {
               makeToast(e.message.toString())
            }
        }
    }

    fun makeToast(message: String) {
        _mainActivityToastMessage.value = message
    }
}