package com.example.android.cocktailapp.recyclerView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/cocktailapp/recyclerView/CocktailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/android/cocktailapp/recyclerView/ViewHolder;", "clickListener", "Lcom/example/android/cocktailapp/recyclerView/CocktailItemListener;", "sharedViewModel", "Lcom/example/android/cocktailapp/viewModels/MainActivityViewModel;", "(Lcom/example/android/cocktailapp/recyclerView/CocktailItemListener;Lcom/example/android/cocktailapp/viewModels/MainActivityViewModel;)V", "value", "", "Lcom/example/android/cocktailapp/domain/DomainCocktail;", "drinks", "getDrinks", "()Ljava/util/List;", "setDrinks", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class CocktailAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.android.cocktailapp.recyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.android.cocktailapp.domain.DomainCocktail> drinks;
    private final com.example.android.cocktailapp.recyclerView.CocktailItemListener clickListener = null;
    private final com.example.android.cocktailapp.viewModels.MainActivityViewModel sharedViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.cocktailapp.domain.DomainCocktail> getDrinks() {
        return null;
    }
    
    public final void setDrinks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.cocktailapp.domain.DomainCocktail> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.recyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.cocktailapp.recyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public CocktailAdapter(@org.jetbrains.annotations.NotNull()
    com.example.android.cocktailapp.recyclerView.CocktailItemListener clickListener, @org.jetbrains.annotations.Nullable()
    com.example.android.cocktailapp.viewModels.MainActivityViewModel sharedViewModel) {
        super();
    }
}