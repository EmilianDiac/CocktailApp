package com.example.android.cocktailapp.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.cocktailapp.R
import com.example.android.cocktailapp.databinding.ActivityMainBinding
import com.example.android.cocktailapp.viewModels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
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
        if(item.itemId == R.id.favorites_navigation_bar && !mainActivityViewModel.onFavoriteClicked.value!!){
            mainActivityViewModel.onFavoriteClicked.value = true
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}