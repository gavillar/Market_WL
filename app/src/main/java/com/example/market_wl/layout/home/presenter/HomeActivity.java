package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.market_wl.R;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.gap, HomeFragment.newInstance())
                    .commitNow();
        }
    }
}