package com.example.market_wl.layout.home.presenter.ui.home.activity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
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
        configureNavigation();
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