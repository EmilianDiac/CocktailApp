package com.example.android.cocktailapp.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/example/android/cocktailapp/viewModels/CocktailDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "cocktailRepository", "Lcom/example/android/cocktailapp/repository/CocktailRepository;", "(Lcom/example/android/cocktailapp/repository/CocktailRepository;)V", "_cocktailDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/cocktailapp/api/CocktailDetails;", "_error", "", "cocktailDetails", "getCocktailDetails", "()Landroidx/lifecycle/MutableLiveData;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "", "cocktailId", "", "app_debug"})
public final class CocktailDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.android.cocktailapp.api.CocktailDetails> _cocktailDetails = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    private final com.example.android.cocktailapp.repository.CocktailRepository cocktailRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.android.cocktailapp.api.CocktailDetails> getCocktailDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void getCocktailDetails(long cocktailId) {
    }
    
    public CocktailDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.repository.CocktailRepository cocktailRepository) {
        super();
    }
}