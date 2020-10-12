package com.example.android.cocktailapp.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.api.Cocktail
import com.example.android.cocktailapp.databinding.CocktailViewBinding

class CocktailAdapter(val clickListener: CocktailItemListener) : RecyclerView.Adapter<ViewHolder>() {

    var drinks = listOf<Cocktail>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = drinks.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cocktail = drinks[position]
        holder.bind(cocktail, clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }
}


class ViewHolder(private val binding: CocktailViewBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(cocktail: Cocktail, clickListener: CocktailItemListener) {
        binding.cocktail = cocktail
        binding.clickListener = clickListener
        binding.cocktailName.text = cocktail.name
        binding.cocktailImage.let {
            Glide.with(binding.root.context)
                .load(cocktail.imageUrl)
                .into(binding.cocktailImage)
        }
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
    fun onClick(cocktail: Cocktail) = clickListener(cocktail.cocktailId)
}