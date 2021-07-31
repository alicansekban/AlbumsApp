package com.alican.workapp.ui.main

import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.alican.workapp.R
import com.alican.workapp.core.BaseActivity
import com.alican.workapp.databinding.ActivityMainBinding
import com.alican.workapp.utils.util.extension.observeWith
import com.alican.workapp.utils.util.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class.java) {
    private var navController: LiveData<NavController>? = null

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun onInit() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            initNavigation()
        }
    }

    private fun initNavigation() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val navGraphIds = listOf(
            R.navigation.album_graph,
            R.navigation.profile_graph,
        )
        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.container,
            intent = intent
        )
        navController?.observe(this, { navController ->
            setupActionBarWithNavController(navController)
        })

        navController = controller
        binding.bottomNavigation.selectedItemId = R.id.album_graph
    }

    private fun navigationChangeListener() {
        navController?.removeObservers(this)
        navController?.observeWith(this) {

        }
    }

    override fun onBackPressed() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        when (navHostFragment.navController.currentDestination?.id) {
            R.id.albumsFragment, R.id.profileFragment -> {
                super.onBackPressed()
            }
            else -> {
                doNavigateUp()
            }
        }

    }


    private fun doNavigateUp() {
        navController?.value?.navigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val navController = findNavController(R.id.container)
        item.let { NavigationUI.onNavDestinationSelected(it, navController) }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.container).navigateUp()

}

