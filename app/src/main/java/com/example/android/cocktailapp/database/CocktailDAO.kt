package com.example.android.cocktailapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CocktailDAO{
    @Update()
    suspend fun markAsFavorite(cocktail: DatabaseCocktail)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(cocktailList: List<DatabaseCocktail>)

    @Query("SELECT * FROM favorite_cocktails_table")
    fun getAllCocktails(): LiveData<List<DatabaseCocktail>>

    @Query("DELETE FROM favorite_cocktails_table")
    suspend fun deleteAllFavoriteCocktails()

    @Query("SELECT * FROM  favorite_cocktails_table WHERE is_favorite = 1")
    fun getFavoriteCocktails(): LiveData<List<DatabaseCocktail>>
}