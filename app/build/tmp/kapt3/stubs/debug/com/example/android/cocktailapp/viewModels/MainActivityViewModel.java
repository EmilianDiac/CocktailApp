package com.example.android.cocktailapp.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001f"}, d2 = {"Lcom/example/android/cocktailapp/viewModels/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mainActivityToastMessage", "Landroidx/lifecycle/MutableLiveData;", "", "alcoholic", "", "cocktailList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/cocktailapp/domain/DomainCocktail;", "getCocktailList", "()Landroidx/lifecycle/LiveData;", "cocktailRepository", "Lcom/example/android/cocktailapp/repository/CocktailRepository;", "getCocktailRepository", "()Lcom/example/android/cocktailapp/repository/CocktailRepository;", "mainActivityToastMessage", "getMainActivityToastMessage", "onFavoriteClicked", "getOnFavoriteClicked", "()Landroidx/lifecycle/MutableLiveData;", "addToFavorites", "", "domainCocktail", "makeToast", "message", "refreshDataFromRepository", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.cocktailapp.repository.CocktailRepository cocktailRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> cocktailList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> onFavoriteClicked = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> alcoholic = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _mainActivityToastMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.cocktailapp.repository.CocktailRepository getCocktailRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.cocktailapp.domain.DomainCocktail>> getCocktailList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnFavoriteClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMainActivityToastMessage() {
        return null;
    }
    
    private final void refreshDataFromRepository() {
    }
    
    public final void addToFavorites(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.domain.DomainCocktail domainCocktail) {
    }
    
    public final void makeToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}