package com.example.android.cocktailapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/cocktailapp/repository/CocktailRepository;", "", "favoritesDAO", "Lcom/example/android/cocktailapp/database/FavoritesDAO;", "(Lcom/example/android/cocktailapp/database/FavoritesDAO;)V", "favoriteCocktails", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/cocktailapp/database/FavoriteCocktail;", "getFavoriteCocktails", "()Landroidx/lifecycle/LiveData;", "insert", "", "cocktail", "Lcom/example/android/cocktailapp/api/Cocktail;", "(Lcom/example/android/cocktailapp/api/Cocktail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CocktailRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.database.FavoriteCocktail>> favoriteCocktails = null;
    private final com.example.android.cocktailapp.database.FavoritesDAO favoritesDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.database.FavoriteCocktail>> getFavoriteCocktails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.api.Cocktail cocktail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public CocktailRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.database.FavoritesDAO favoritesDAO) {
        super();
    }
}