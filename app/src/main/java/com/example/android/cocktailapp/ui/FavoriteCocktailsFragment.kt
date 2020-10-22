package com.example.android.cocktailapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.databinding.FragmentFavoriteCocktailsBinding
import com.example.android.cocktailapp.recyclerView.CocktailAdapter
import com.example.android.cocktailapp.recyclerView.CocktailItemListener
import com.example.android.cocktailapp.viewModels.FavoritesViewModel
import com.example.android.cocktailapp.viewModels.MainActivityViewModel


class FavoriteCocktailsFragment : Fragment() {

    private lateinit var favoritesViewModel: FavoritesViewModel
    private val sharedViewModel: MainActivityViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        favoritesViewModel = ViewModelProvider(this).get(FavoritesViewModel::class.java)
        return inflater.inflate(R.layout.fragment_favorite_cocktails, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentFavoriteCocktailsBinding.bind(view)
        binding.favoritesViewModel = favoritesViewModel
        favoritesViewModel.instantiateFavoritesCocktailList(sharedViewModel.cocktailRepository)


        val adapter = CocktailAdapter(CocktailItemListener{cocktailId ->
            sharedViewModel.makeToast(cocktailId.toString())
        })

        binding.favoritesRecyclerView.adapter = adapter
        binding.favoritesRecyclerView.layoutManager = LinearLayoutManager(context)
        favoritesViewModel.favoriteCocktailsList.observe(viewLifecycleOwner, Observer{
            adapter.drinks = it
        })

        super.onViewCreated(view, savedInstanceState)
    }


}