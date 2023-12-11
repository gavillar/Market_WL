package com.example.market_wl.layout.presenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.market_wl.R;
import com.example.market_wl.layout.presenter.ui.offers.OffersFragment;

public class OffersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, OffersFragment.newInstance())
                    .commitNow();
        }
    }
}