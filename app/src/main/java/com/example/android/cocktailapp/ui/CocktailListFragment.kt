package com.example.android.cocktailapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.databinding.FragmentDrinksListBinding
import com.example.android.cocktailapp.manualDependencyInjection.MyApplication
import com.example.android.cocktailapp.recyclerView.CocktailAdapter
import com.example.android.cocktailapp.recyclerView.CocktailItemListener
import com.example.android.cocktailapp.viewModels.CocktailListViewModel
import com.example.android.cocktailapp.viewModels.MainActivityViewModel


class CocktailListFragment : Fragment() {

    private lateinit var sharedViewModel: MainActivityViewModel

    private lateinit var cocktailListViewModel: CocktailListViewModel

    private var binding: FragmentDrinksListBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appContainer = (activity?.application as MyApplication).appContainer
        sharedViewModel = appContainer.mainActivityViewModel
        cocktailListViewModel = ViewModelProvider(this).get(CocktailListViewModel::class.java)
        cocktailListViewModel.setRepository(appContainer.cocktailRepository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_drinks_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDrinksListBinding.bind(view)
        binding!!.mainActivityViewModel = sharedViewModel

        val adapter = CocktailAdapter(CocktailItemListener {cocktailId ->
            val action = CocktailListFragmentDirections.actionDrinksListFragmentToCocktailDetailFragment(cocktailId)
            this.findNavController().navigate(action)
        }, sharedViewModel)
        binding!!.cocktailsListRecyclerView.adapter = adapter
        binding!!.cocktailsListRecyclerView.layoutManager = LinearLayoutManager(context)


        activity?.let {it
            cocktailListViewModel.cocktailList.observe(it, Observer { newDrinksList ->
                adapter.drinks = newDrinksList
            })

            cocktailListViewModel.toastMessage.observe(it, Observer { message ->
                sharedViewModel.makeToast(message)
            })

            sharedViewModel.refreshPressed.observe(it, Observer {value ->
                if(value) {
                    cocktailListViewModel.refreshDataFromRepository()
                }
            })

            sharedViewModel.onFavoriteClicked.observe(it, Observer{ isTrue ->
                if(isTrue) {
                    val action =
                        CocktailListFragmentDirections.actionDrinksListFragmentToFavoriteCocktailsFragment()

                    this.findNavController().navigate(action)
                    sharedViewModel.onFavoriteClicked.value = false
                }
            })
        }
    }


}