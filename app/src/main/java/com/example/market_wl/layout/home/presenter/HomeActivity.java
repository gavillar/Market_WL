package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityHomeBindingRoot());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(
                    getActivityHomeBinding().homeFrameLayout.getId(),
                    HomeFragment.newInstance()
                )
                .commitNow();
        }
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