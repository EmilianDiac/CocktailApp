package com.example.android.cocktailapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e5\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018\u00a8\u0006I"}, d2 = {"Lcom/example/android/cocktailapp/api/CocktailDetails;", "", "cocktailImageUrl", "", "cocktailName", "cocktailCategory", "cocktailGlassType", "strIngredient1", "strIngredient2", "strIngredient3", "strIngredient4", "strIngredient5", "strIngredient6", "strIngredient7", "strIngredient8", "strIngredient9", "strIngredient10", "strIngredient11", "strIngredient12", "strIngredient13", "strIngredient14", "strIngredient15", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCocktailCategory", "()Ljava/lang/String;", "getCocktailGlassType", "getCocktailImageUrl", "cocktailIngredielntsList", "", "getCocktailIngredielntsList", "()Ljava/util/List;", "getCocktailName", "getStrIngredient1", "getStrIngredient10", "getStrIngredient11", "getStrIngredient12", "getStrIngredient13", "getStrIngredient14", "getStrIngredient15", "getStrIngredient2", "getStrIngredient3", "getStrIngredient4", "getStrIngredient5", "getStrIngredient6", "getStrIngredient7", "getStrIngredient8", "getStrIngredient9", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CocktailDetails {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> cocktailIngredielntsList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cocktailImageUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cocktailName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cocktailCategory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cocktailGlassType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient4 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient5 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient6 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient7 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient8 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient9 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient10 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient11 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient12 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient13 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient14 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strIngredient15 = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCocktailIngredielntsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCocktailImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCocktailName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCocktailCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCocktailGlassType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrIngredient15() {
        return null;
    }
    
    public CocktailDetails(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strDrinkThumb")
    java.lang.String cocktailImageUrl, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strDrink")
    java.lang.String cocktailName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strCategory")
    java.lang.String cocktailCategory, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strGlass")
    java.lang.String cocktailGlassType, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient1, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient2, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient3, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient4, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient5, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient6, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient7, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient8, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient9, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient10, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient11, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient12, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient13, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient14, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient15) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.cocktailapp.api.CocktailDetails copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strDrinkThumb")
    java.lang.String cocktailImageUrl, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strDrink")
    java.lang.String cocktailName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strCategory")
    java.lang.String cocktailCategory, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strGlass")
    java.lang.String cocktailGlassType, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient1, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient2, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient3, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient4, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient5, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient6, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient7, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient8, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient9, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient10, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient11, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient12, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient13, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient14, @org.jetbrains.annotations.Nullable()
    java.lang.String strIngredient15) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}