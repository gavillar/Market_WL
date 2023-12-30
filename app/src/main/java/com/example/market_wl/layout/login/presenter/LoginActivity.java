package com.example.market_wl.layout.login.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.market_wl.databinding.ActivityLoginBinding;
import com.example.market_wl.layout.home.presenter.ui.home.activity.HomeActivity;
import com.example.market_wl.layout.login.presenter.ui.login.LoginFragment;
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding activityLoginBinding;

    private AppCompatButton loginActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLoginActivityButton();
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

    private void setLoginActivityButton() {
        if(loginActivityButton == null) {
            loginActivityButton = getActivityLoginBinding().loginActivityButton;
            loginActivityButton.setOnClickListener(
                    view -> {
                        Intent intent = new Intent(
                                this, HomeActivity.class
                        );
                        startActivity(intent);
                    }
            );
        }
    }
}