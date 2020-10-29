package com.example.android.cocktailapp.viewModels

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.cocktailapp.domain.DomainCocktail
import com.example.android.cocktailapp.repository.CocktailRepository
import kotlinx.coroutines.launch
import java.io.IOException

class CocktailListViewModel : ViewModel() {

    private lateinit var cocktailRepository : CocktailRepository
    lateinit var cocktailList: LiveData<List<DomainCocktail>>//= cocktailRepository.cocktailsList

    private val _toastMessage = MutableLiveData<String>()
    val toastMessage: LiveData<String>
        get() = _toastMessage

    fun setRepository(repository: CocktailRepository) {
        cocktailRepository = repository
        cocktailList = cocktailRepository.cocktailsList
        refreshDataFromRepository()
    }

    fun refreshDataFromRepository() {
        Log.d(TAG, "refreshDataFromRepository: Fac Refresh///////////////////////////////////")
        viewModelScope.launch {
            try{
                cocktailRepository.refreshCocktailList()
            } catch (networkError: IOException) {
                if(cocktailList.value.isNullOrEmpty()){
                    _toastMessage.value = "Network Error: " + networkError.message.toString()
                }
            }
        }
    }

}