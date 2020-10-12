package com.example.android.cocktailapp.viewModels

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.api.CocktailApi
import kotlinx.coroutines.launch
import java.io.InputStream
import java.net.URL

class MainActivityViewModel : ViewModel() {

    val onFavoriteClicked = MutableLiveData<Boolean>(false)

    val alcoholic = MutableLiveData<Boolean>()
    private val _drinks = MutableLiveData<List<Cocktail>>()
    val drinks: LiveData<List<Cocktail>>
        get() = _drinks

    //todo make a toast for error in activity
    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    init {
        alcoholic.value = false
        getCocktails()
    }
    private fun getCocktails() {
        viewModelScope.launch {
            try {
                _drinks.value = CocktailApi.retrofitService.getCocktails().list
            } catch (e: Exception) {
                _error.value = e.message.toString()
            }
        }
    }
}