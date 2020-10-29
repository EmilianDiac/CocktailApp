package com.example.android.cocktailapp.manualDependencyInjection

import android.content.Context
import com.example.android.cocktailapp.api.CocktailApiService
import com.example.android.cocktailapp.database.CocktailRoomDatabase
import com.example.android.cocktailapp.repository.CocktailRepository
import com.example.android.cocktailapp.viewModels.MainActivityViewModel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "https://www.thecocktaildb.com"

class AppContainer(context: Context) {

    private val cocktailRoomDatabase = CocktailRoomDatabase.getDatabase(context)
    private val cocktailDAO = cocktailRoomDatabase.getCocktailDao()


    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    private val cocktailApiService = retrofit.create(CocktailApiService::class.java)

    val cocktailRepository = CocktailRepository(cocktailDAO, cocktailApiService)

    val mainActivityViewModelFactory = MainActivityViewModelFactory(cocktailRepository)

    val mainActivityViewModel = mainActivityViewModelFactory.create()
}

interface Factory<T> {
    fun create(): T
}


class MainActivityViewModelFactory(private val cocktailRepository: CocktailRepository) :
    Factory<MainActivityViewModel> {
    override fun create(): MainActivityViewModel {
        return MainActivityViewModel(cocktailRepository)
    }
}