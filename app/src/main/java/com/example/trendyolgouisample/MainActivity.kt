package com.example.trendyolgouisample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.trendyolgouisample.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initView()
        eventView()

        bottomNavigation()


    }

    private fun bottomNavigation() {
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.mainFragment -> navigateToFragment(R.id.mainFragment)
                R.id.myAccountFragment -> navigateToFragment(R.id.myAccountFragment)
                R.id.myOrdersFragment -> navigateToFragment(R.id.myOrdersFragment)
            }
            true
        }
    }


    private fun navigateToFragment(fragmentId: Int) {
        val navControl = navHostFragment.navController
        val currentDestination = navControl.currentDestination?.id

        if (currentDestination != fragmentId) {
            val navOptions = NavOptions.Builder().setPopUpTo(
                fragmentId, true
            ).build()

            navControl.navigate(fragmentId, null, navOptions)
        }


    }


    private fun initView() {
        bottomNav = binding.bottomNav
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    }

    private fun eventView() {
        bottomNav.setupWithNavController(navHostFragment.navController)
    }


}




