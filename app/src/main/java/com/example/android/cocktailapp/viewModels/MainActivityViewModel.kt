package com.example.android.cocktailapp.viewModels

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.*
import com.example.android.cocktailapp.api.NetworkCocktail
import com.example.android.cocktailapp.api.CocktailApi
import com.example.android.cocktailapp.database.CocktailRoomDatabase
import com.example.android.cocktailapp.domain.DomainCocktail
import com.example.android.cocktailapp.repository.CocktailRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    val cocktailRepository: CocktailRepository

    val cocktailList: LiveData<List<DomainCocktail>>

    val onFavoriteClicked = MutableLiveData<Boolean>(false)

    private val alcoholic = MutableLiveData<Boolean>()

    //todo make a toast for error in activity
    private val _mainActivityToastMessage = MutableLiveData<String>()
    val mainActivityToastMessage: LiveData<String>
        get() = _mainActivityToastMessage

    init {
        val database = CocktailRoomDatabase.getDatabase(application)
        val cocktailDAO = database.getCocktailDao()
        cocktailRepository = CocktailRepository(cocktailDAO)
        cocktailList = cocktailRepository.cocktailsList
        alcoholic.value = false
        refreshDataFromRepository()
    }

    private fun refreshDataFromRepository() {
        viewModelScope.launch {
            try{
                cocktailRepository.refreshCocktailList()
            } catch (networkError: IOException) {
                if(cocktailList.value.isNullOrEmpty()){
                    makeToast("Network Error: " + networkError.message.toString())
                }
            }
        }
    }

    fun addToFavorites(domainCocktail: DomainCocktail) {
        viewModelScope.launch(Dispatchers.IO) {
            cocktailRepository.addToFavorite(domainCocktail)
        }
    }

    fun makeToast(message: String) {
        _mainActivityToastMessage.value = message
    }
}