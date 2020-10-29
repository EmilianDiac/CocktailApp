package com.example.android.cocktailapp.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/cocktailapp/viewModels/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "cocktailRepository", "Lcom/example/android/cocktailapp/repository/CocktailRepository;", "(Lcom/example/android/cocktailapp/repository/CocktailRepository;)V", "_mainActivityToastMessage", "Landroidx/lifecycle/MutableLiveData;", "", "alcoholic", "", "getCocktailRepository", "()Lcom/example/android/cocktailapp/repository/CocktailRepository;", "mainActivityToastMessage", "Landroidx/lifecycle/LiveData;", "getMainActivityToastMessage", "()Landroidx/lifecycle/LiveData;", "onFavoriteClicked", "getOnFavoriteClicked", "()Landroidx/lifecycle/MutableLiveData;", "refreshPressed", "getRefreshPressed", "addToFavorites", "", "domainCocktail", "Lcom/example/android/cocktailapp/domain/DomainCocktail;", "makeToast", "message", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> onFavoriteClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> refreshPressed = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> alcoholic = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _mainActivityToastMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.cocktailapp.repository.CocktailRepository cocktailRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnFavoriteClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRefreshPressed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMainActivityToastMessage() {
        return null;
    }
    
    public final void addToFavorites(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.domain.DomainCocktail domainCocktail) {
    }
    
    public final void makeToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.cocktailapp.repository.CocktailRepository getCocktailRepository() {
        return null;
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.repository.CocktailRepository cocktailRepository) {
        super();
    }
}