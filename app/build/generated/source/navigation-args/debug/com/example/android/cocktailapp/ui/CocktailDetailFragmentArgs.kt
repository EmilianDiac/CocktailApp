package com.example.android.cocktailapp.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

data class CocktailDetailFragmentArgs(
  val cocktailId: Long
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("cocktailId", this.cocktailId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CocktailDetailFragmentArgs {
      bundle.setClassLoader(CocktailDetailFragmentArgs::class.java.classLoader)
      val __cocktailId : Long
      if (bundle.containsKey("cocktailId")) {
        __cocktailId = bundle.getLong("cocktailId")
      } else {
        throw IllegalArgumentException("Required argument \"cocktailId\" is missing and does not have an android:defaultValue")
      }
      return CocktailDetailFragmentArgs(__cocktailId)
    }
  }
}
