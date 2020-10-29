package com.example.android.cocktailapp.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FavoritesDAO{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cocktail: FavoriteCocktail)

    @Query("SELECT * FROM favorite_cocktails_table ORDER BY name ASC")
    fun getAllFavoriteCocktails(): LiveData<MutableList<FavoriteCocktail>>

    @Query("DELETE FROM favorite_cocktails_table")
    suspend fun deleteAllFavoriteCocktails()

}