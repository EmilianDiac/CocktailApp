package com.example.android.cocktailapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/cocktailapp/repository/CocktailRepository;", "", "cocktailDAO", "Lcom/example/android/cocktailapp/database/CocktailDAO;", "cocktailApiService", "Lcom/example/android/cocktailapp/api/CocktailApiService;", "(Lcom/example/android/cocktailapp/database/CocktailDAO;Lcom/example/android/cocktailapp/api/CocktailApiService;)V", "cocktailsList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/cocktailapp/domain/DomainCocktail;", "getCocktailsList", "()Landroidx/lifecycle/LiveData;", "favoriteCocktails", "getFavoriteCocktails", "addToFavorite", "", "cocktail", "(Lcom/example/android/cocktailapp/domain/DomainCocktail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCocktailDetail", "Lcom/example/android/cocktailapp/api/CocktailDetails;", "cocktailId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshCocktailList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CocktailRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> cocktailsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> favoriteCocktails = null;
    private final com.example.android.cocktailapp.database.CocktailDAO cocktailDAO = null;
    private final com.example.android.cocktailapp.api.CocktailApiService cocktailApiService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> getCocktailsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> getFavoriteCocktails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addToFavorite(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.domain.DomainCocktail cocktail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshCocktailList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCocktailDetail(long cocktailId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.cocktailapp.api.CocktailDetails> p1) {
        return null;
    }
    
    public CocktailRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.database.CocktailDAO cocktailDAO, @org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.api.CocktailApiService cocktailApiService) {
        super();
    }
}