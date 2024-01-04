package com.example.market_wl.layout.home.presenter.ui.home.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
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
import com.example.market_wl.layout.address.presenter.AdressFragment;
import com.example.market_wl.layout.cart.presenter.fragments.CartFragment;
import com.example.market_wl.layout.coupons.presenter.fragments.CouponsFragment;
import com.example.market_wl.layout.home.presenter.carousel.SlideItem;
import com.example.market_wl.layout.home.presenter.carousel.SliderAdapter;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

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
        configureNavigation();
        configureDrawerNavigation();
        getActivityHomeBindingRoot();

    }

    private void configureNavigation() {
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

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            String fragmentLabel = destination != null ? destination.getLabel().toString() : "";
            updateToolbarTitle(fragmentLabel);
        });
    }

    private void updateToolbarTitle(String title) {
        TextView customTitle = new TextView(this);
        customTitle.setText(title);
        customTitle.setTextSize(20);
        customTitle.setTextColor(getResources().getColor(R.color.purple));

        Toolbar.LayoutParams params = new Toolbar.LayoutParams(
                Toolbar.LayoutParams.WRAP_CONTENT,
                Toolbar.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER);
        customTitle.setLayoutParams(params);

        Toolbar myToolbar = activityHomeBinding.getRoot().findViewById(R.id.home_toolbar);
        myToolbar.removeViewAt(myToolbar.getChildCount() - 1);
        myToolbar.addView(customTitle);
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

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    private void configureDrawerNavigation() {

        drawerLayout = findViewById(R.id.home_drawerLayout);
        navigationView = findViewById(R.id.home_navigation_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.adress_fragment:
                        selectedFragment = new AdressFragment();

                        if(selectedFragment != null) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.adress_fragment, new AdressFragment())
                                    .commit();
                        }
                }
                return true;
            }
        });
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