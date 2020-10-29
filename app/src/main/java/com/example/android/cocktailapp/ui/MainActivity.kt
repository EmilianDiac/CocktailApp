package com.example.android.cocktailapp.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.databinding.ActivityMainBinding
import com.example.android.cocktailapp.manualDependencyInjection.MyApplication
import com.example.android.cocktailapp.viewModels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        val appContainer = (application as MyApplication).appContainer
        mainActivityViewModel = appContainer.mainActivityViewModel
        binding.mainActivityViewModel = mainActivityViewModel

        mainActivityViewModel.mainActivityToastMessage.observe(this, Observer {
            if(it != null) {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.favorites_navigation_bar -> if (!mainActivityViewModel.onFavoriteClicked.value!!) {
                mainActivityViewModel.onFavoriteClicked.value = true
            }
            R.id.refresh_cocktails -> mainActivityViewModel.refreshPressed.value = true

        }

        return super.onOptionsItemSelected(item)
    }
}