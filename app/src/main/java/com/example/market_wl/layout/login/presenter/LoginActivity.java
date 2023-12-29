package com.example.market_wl.layout.login.presenter;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.market_wl.R;

import com.example.market_wl.layout.login.presenter.ui.login.LoginFragment;
import com.example.market_wl.databinding.ActivityLoginBinding;
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding activityLoginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLogin());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(
                    getActivityLoginFrameLayout().getId(),
                    LoginFragment.newInstance()
                )
                .commitNow();
        }
    }

    private ActivityLoginBinding getActivityLoginBinding() {
        if (activityLoginBinding == null) {
            activityLoginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        }
        return activityLoginBinding;
    }

    private ConstraintLayout getActivityLogin() {
        return getActivityLoginBinding().getRoot();
    }

    private FrameLayout getActivityLoginFrameLayout() {
        return getActivityLoginBinding().loginActivityFrameLayout;
    }
}