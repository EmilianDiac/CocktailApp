package com.example.android.cocktailapp.domain

data class DomainCocktail(
    val name: String,
    val id: Long,
    val imageUrl: String,
    var isFavorite: Boolean
)