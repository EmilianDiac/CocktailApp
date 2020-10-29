package com.example.android.cocktailapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/cocktailapp/api/CocktailApiService;", "", "getCocktailDetails", "Lcom/example/android/cocktailapp/api/DrinksDetails;", "cocktailId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCocktailDetails1", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCocktails", "Lcom/example/android/cocktailapp/api/DrinksList;", "app_debug"})
public abstract interface CocktailApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/json/v1/1/filter.php?a=Alcoholic")
    public abstract java.lang.Object getCocktails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.cocktailapp.api.DrinksList> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/json/v1/1/lookup.php")
    public abstract java.lang.Object getCocktailDetails(@retrofit2.http.Query(value = "i")
    long cocktailId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.cocktailapp.api.DrinksDetails> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/json/v1/1/lookup.php?i=11007")
    public abstract java.lang.Object getCocktailDetails1(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.cocktailapp.api.DrinksDetails> p0);
}