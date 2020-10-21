package com.example.android.cocktailapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.api.CocktailDetails
import com.example.android.cocktailapp.databinding.FragmentCocktailDetailBinding
import com.example.android.cocktailapp.viewModels.CocktailDetailViewModel


class CocktailDetailFragment : Fragment() {

    val args: CocktailDetailFragmentArgs by navArgs()

    private lateinit var cocktailDetailViewModel: CocktailDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cocktail_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        cocktailDetailViewModel = ViewModelProvider(this).get(CocktailDetailViewModel::class.java)
        val binding = FragmentCocktailDetailBinding.bind(view)
        val cocktailId =args.cocktailId
        cocktailDetailViewModel.getCocktailDetails(cocktailId)

        cocktailDetailViewModel.cocktailDetails.observe(viewLifecycleOwner, Observer { details ->

            updateUI(binding, details)
        })

        cocktailDetailViewModel.error.observe(viewLifecycleOwner, Observer{errorMessage ->
            Toast.makeText(context, errorMessage, Toast.LENGTH_LONG).show()

        })



        super.onViewCreated(view, savedInstanceState)
    }

    private fun updateUI(
        binding: FragmentCocktailDetailBinding,
        details: CocktailDetails
    ) {
        binding.cocktailTitle.text = details.cocktailName
        binding.cocktailCategory.text = details.cocktailCategory
        binding.cocktailGlassType.text = details.cocktailGlassType
        for (i in details.cocktailIngredielntsList) {
            val text = binding.cocktailIngredients.text.toString() + i.toString() + "\n"
            binding.cocktailIngredients.text = text
        }
        binding.cocktailImageView.let {
            Glide.with(binding.root.context)
                .load(details.cocktailImageUrl)
                .into(it)
        }
    }
}