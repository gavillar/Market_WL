package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.extensions.AppCompatActivityExtended;

public class HomeActivity extends AppCompatActivityExtended {

    private ActivityHomeBinding activityHomeBinding;



    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityHomeBinding().getRoot());
        getHomeFragmentContainerView();
        getActivityHomeBindingRoot();
    }


    private void getHomeFragmentContainerView() {
        final NavHostFragment navHostFragment = (
            (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(
                    getActivityHomeBinding()
                    .homeFragmentContainerView
                    .getId()
                )
        );
        assert navHostFragment != null;
        final NavController navController = (
            navHostFragment
                .getNavController()
        );
        NavigationUI.setupWithNavController(activityHomeBinding.bottomNavigation, navController);
    }
    private void getActivityHomeBindingRoot() {
        final DrawerLayout drawerLayout = (
                getActivityHomeBinding().getRoot()
        );
        getActivityHomeBinding()
                .homeToolbarMenu.setOnClickListener(
                        view -> drawerLayout.open()

                );
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