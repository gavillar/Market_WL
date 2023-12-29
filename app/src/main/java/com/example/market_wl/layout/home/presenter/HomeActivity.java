package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;
import android.view.View;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.extensions.AppCompatActivityExtended;
import com.example.market_wl.layout.cart.presenter.fragments.CartFragment;
import com.example.market_wl.layout.home.presenter.carousel.SlideItem;
import com.example.market_wl.layout.home.presenter.carousel.SliderAdapter;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

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