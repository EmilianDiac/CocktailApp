package com.example.android.cocktailapp.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.api.NetworkCocktail
import com.example.android.cocktailapp.databinding.CocktailViewBinding
import com.example.android.cocktailapp.domain.DomainCocktail
import com.example.android.cocktailapp.viewModels.MainActivityViewModel

class CocktailAdapter(
    private val clickListener: CocktailItemListener,
    private val sharedViewModel: MainActivityViewModel? = null
) : RecyclerView.Adapter<ViewHolder>() {


    var drinks = listOf<DomainCocktail>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = drinks.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cocktail = drinks[position]
        holder.bind(cocktail, clickListener, sharedViewModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }
}


class ViewHolder(private val binding: CocktailViewBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(
        cocktail: DomainCocktail,
        clickListener: CocktailItemListener,
        sharedViewModel: MainActivityViewModel?
    ) {
        binding.cocktail = cocktail
        binding.clickListener = clickListener
        binding.cocktailName.text = cocktail.name
        binding.cocktailImage.let {
            Glide.with(binding.root.context)
                .load(cocktail.imageUrl)
                .into(binding.cocktailImage)
        }
        binding.favoriteButton.setOnClickListener {
            sharedViewModel?.addToFavorites(cocktail)
        }
        binding.favoriteButton.setImageResource(
            if (cocktail.isFavorite) {
                R.drawable.favorite_marked
            } else {
                R.drawable.favorite_unmarked
            }
        )
    }

    companion object {
        fun from(parent: ViewGroup): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = CocktailViewBinding.inflate(layoutInflater, parent, false)
            return ViewHolder(binding)
        }
    }
}

class CocktailItemListener(val clickListener: (cocktailId: Long) -> Unit) {
    fun onClick(cocktail: DomainCocktail) = clickListener(cocktail.id)
}