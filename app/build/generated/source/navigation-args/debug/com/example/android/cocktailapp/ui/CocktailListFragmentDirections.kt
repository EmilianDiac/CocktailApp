package com.example.android.cocktailapp.ui

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.cocktailapp.R
import kotlin.Int
import kotlin.Long

class CocktailListFragmentDirections private constructor() {
  private data class ActionDrinksListFragmentToCocktailDetailFragment(
    val cocktailId: Long
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_drinksListFragment_to_cocktailDetailFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("cocktailId", this.cocktailId)
      return result
    }
  }

  companion object {
    fun actionDrinksListFragmentToCocktailDetailFragment(cocktailId: Long): NavDirections =
        ActionDrinksListFragmentToCocktailDetailFragment(cocktailId)

    fun actionDrinksListFragmentToFavoriteCocktailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_drinksListFragment_to_favoriteCocktailsFragment)
  }
}
