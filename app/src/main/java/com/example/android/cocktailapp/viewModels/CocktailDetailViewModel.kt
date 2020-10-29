package com.example.android.cocktailapp.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.cocktailapp.api.CocktailDetails
import com.example.android.cocktailapp.repository.CocktailRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class CocktailDetailViewModel(private val cocktailRepository: CocktailRepository) : ViewModel() {

    private val _cocktailDetails = MutableLiveData<CocktailDetails>()
    val cocktailDetails: MutableLiveData<CocktailDetails>
        get() = _cocktailDetails

    //todo make a toast for error
    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    fun getCocktailDetails(cocktailId: Long) {
        viewModelScope.launch {
            try {
                _cocktailDetails.value = cocktailRepository.getCocktailDetail(cocktailId)
                Log.d("RESULT", _cocktailDetails.value.toString() )
            } catch (e: Exception) {
                _error.value = "Error: " + e.message
            }
        }
    }
}