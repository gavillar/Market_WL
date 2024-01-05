package com.example.market_wl.layout.payments.ui.payments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.market_wl.R;
import com.example.market_wl.layout.payments.ui.payments.fragments.PaymentsFragment;

public class PaymentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PaymentsFragment.newInstance())
                    .commitNow();
        }
    }
}