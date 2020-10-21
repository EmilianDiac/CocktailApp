package com.example.android.cocktailapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_cocktails_table")
data class FavoriteCocktail (val name: String,
                             @ColumnInfo(name = "image_url") val imageUrl: String,
                             @PrimaryKey @ColumnInfo(name = "cocktail_id")  val cocktailId: Long)