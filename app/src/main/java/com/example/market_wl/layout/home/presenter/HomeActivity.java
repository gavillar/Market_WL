package com.example.market_wl.layout.home.presenter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityHomeBinding().getRoot());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(
                    getActivityHomeBinding().homeFrameLayout.getId(),
                    HomeFragment.newInstance()
                )
                .commitNow();
        }
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