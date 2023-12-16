package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;

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
        getActivityHomeBinding().getRoot().open();
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