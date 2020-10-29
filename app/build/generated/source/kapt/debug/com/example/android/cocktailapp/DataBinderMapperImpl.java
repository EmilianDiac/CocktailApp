package com.example.android.cocktailapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.cocktailapp.databinding.ActivityMainBindingImpl;
import com.example.android.cocktailapp.databinding.CocktailViewBindingImpl;
import com.example.android.cocktailapp.databinding.FragmentCocktailDetailBindingImpl;
import com.example.android.cocktailapp.databinding.FragmentDrinksListBindingImpl;
import com.example.android.cocktailapp.databinding.FragmentFavoriteCocktailsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_COCKTAILVIEW = 2;

  private static final int LAYOUT_FRAGMENTCOCKTAILDETAIL = 3;

  private static final int LAYOUT_FRAGMENTDRINKSLIST = 4;

  private static final int LAYOUT_FRAGMENTFAVORITECOCKTAILS = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.cocktailapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.cocktailapp.R.layout.cocktail_view, LAYOUT_COCKTAILVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.cocktailapp.R.layout.fragment_cocktail_detail, LAYOUT_FRAGMENTCOCKTAILDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.cocktailapp.R.layout.fragment_drinks_list, LAYOUT_FRAGMENTDRINKSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.cocktailapp.R.layout.fragment_favorite_cocktails, LAYOUT_FRAGMENTFAVORITECOCKTAILS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_COCKTAILVIEW: {
          if ("layout/cocktail_view_0".equals(tag)) {
            return new CocktailViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cocktail_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOCKTAILDETAIL: {
          if ("layout/fragment_cocktail_detail_0".equals(tag)) {
            return new FragmentCocktailDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cocktail_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRINKSLIST: {
          if ("layout/fragment_drinks_list_0".equals(tag)) {
            return new FragmentDrinksListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drinks_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITECOCKTAILS: {
          if ("layout/fragment_favorite_cocktails_0".equals(tag)) {
            return new FragmentFavoriteCocktailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_cocktails is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "cocktail");
      sKeys.put(3, "favoritesViewModel");
      sKeys.put(4, "mainActivityViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.android.cocktailapp.R.layout.activity_main);
      sKeys.put("layout/cocktail_view_0", com.example.android.cocktailapp.R.layout.cocktail_view);
      sKeys.put("layout/fragment_cocktail_detail_0", com.example.android.cocktailapp.R.layout.fragment_cocktail_detail);
      sKeys.put("layout/fragment_drinks_list_0", com.example.android.cocktailapp.R.layout.fragment_drinks_list);
      sKeys.put("layout/fragment_favorite_cocktails_0", com.example.android.cocktailapp.R.layout.fragment_favorite_cocktails);
    }
  }
}
