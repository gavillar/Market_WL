package com.example.market_wl.login.presenter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.market_wl.R;
import com.example.market_wl.login.presenter.ui.login.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }
    }
}