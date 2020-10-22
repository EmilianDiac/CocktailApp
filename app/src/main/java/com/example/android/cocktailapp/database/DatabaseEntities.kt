package com.example.android.cocktailapp.database

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.android.cocktailapp.domain.DomainCocktail

@Entity(tableName = "favorite_cocktails_table")
data class DatabaseCocktail(
    val name: String,
    @ColumnInfo(name = "image_url") val imageUrl: String,
    @PrimaryKey @ColumnInfo(name = "cocktail_id") val cocktailId: Long,
    @ColumnInfo(name = "is_favorite") val isFavorite: Boolean = false
)

fun List<DatabaseCocktail>.asDomainCocktail(): List<DomainCocktail> {
    return map {
        DomainCocktail(
            name = it.name,
            id = it.cocktailId,
            imageUrl = it.imageUrl,
            isFavorite = it.isFavorite
        )
    }
}