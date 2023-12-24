package com.example.market_wl.layout.home.presenter;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding activityHomeBinding;

    private NavHostFragment navHostFragment;
    private NavController navController;



    @Override
    protected void onCreate(
        Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = activityHomeBinding.inflate(getLayoutInflater());
        setContentView(activityHomeBinding.getRoot());

        initNavigation();
        getActivityHomeBindingRoot();
    }


    private void initNavigation() {
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.homeFragmentContainerView);

        navController = navHostFragment.getNavController();

        NavigationUI.setupWithNavController(activityHomeBinding.bottomNavigation, navController);

    }
    private DrawerLayout getActivityHomeBindingRoot() {
        final DrawerLayout drawerLayout = (
            getActivityHomeBinding().getRoot()
        );
        getActivityHomeBinding()
            .homeToolbarMenu.setOnClickListener(
                view -> drawerLayout.open()

            );
        return drawerLayout;
    }

    private ActivityHomeBinding getActivityHomeBinding() {
        if(activityHomeBinding == null) {
            activityHomeBinding = (
                ActivityHomeBinding.inflate(
                    getLayoutInflater()
                )
            );
        }
        return activityHomeBinding;
    }
}