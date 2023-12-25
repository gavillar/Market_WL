package com.example.market_wl.layout.login.presenter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.market_wl.R;

import com.example.market_wl.layout.login.presenter.ui.login.LoginFragment;
import com.example.market_wl.databinding.ActivityLoginBinding;
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding activityLoginBinding;

    private ActivityLoginBinding getActivityLoginBinding() {
        if (activityLoginBinding == null) {
            activityLoginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        }
        return activityLoginBinding;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(getActivityLoginBinding().getRoot().getId(), LoginFragment.newInstance())
                    .commitNow();
        }
    }
}