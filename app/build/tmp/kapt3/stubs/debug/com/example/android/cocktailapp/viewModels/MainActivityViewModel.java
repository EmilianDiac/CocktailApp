package com.example.android.cocktailapp.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/cocktailapp/viewModels/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_drinks", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/android/cocktailapp/api/Cocktail;", "_mainActivityToastMessage", "", "alcoholic", "", "getAlcoholic", "()Landroidx/lifecycle/MutableLiveData;", "drinks", "Landroidx/lifecycle/LiveData;", "getDrinks", "()Landroidx/lifecycle/LiveData;", "favoriteCocktailToAdd", "getFavoriteCocktailToAdd", "mainActivityToastMessage", "getMainActivityToastMessage", "onFavoriteClicked", "getOnFavoriteClicked", "getCocktails", "", "makeToast", "message", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> onFavoriteClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.android.cocktailapp.api.Cocktail> favoriteCocktailToAdd = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> alcoholic = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.cocktailapp.api.Cocktail>> _drinks = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _mainActivityToastMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnFavoriteClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.android.cocktailapp.api.Cocktail> getFavoriteCocktailToAdd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAlcoholic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.api.Cocktail>> getDrinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMainActivityToastMessage() {
        return null;
    }
    
    private final void getCocktails() {
    }
    
    public final void makeToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public MainActivityViewModel() {
        super();
    }
}