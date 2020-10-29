package com.example.android.cocktailapp.viewModels

import android.app.Application
import androidx.lifecycle.*
import com.example.android.cocktailapp.database.CocktailRoomDatabase
import com.example.android.cocktailapp.domain.DomainCocktail
import com.example.android.cocktailapp.manualDependencyInjection.MyApplication
import com.example.android.cocktailapp.repository.CocktailRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException

class MainActivityViewModel(val cocktailRepository: CocktailRepository) : ViewModel() {

    val onFavoriteClicked = MutableLiveData<Boolean>(false)
    val refreshPressed = MutableLiveData<Boolean>(false)


    private val alcoholic = MutableLiveData<Boolean>()

    private val _mainActivityToastMessage = MutableLiveData<String>()
    val mainActivityToastMessage: LiveData<String>
        get() = _mainActivityToastMessage

    init {
        alcoholic.value = false
    }

    //todo asta ar trebui mutata de aici
    fun addToFavorites(domainCocktail: DomainCocktail) {
        viewModelScope.launch(Dispatchers.IO) {
            cocktailRepository.addToFavorite(domainCocktail)
        }
    }

    fun makeToast(message: String) {
        _mainActivityToastMessage.value = message
    }
}