package com.example.market_wl.layout.register.presenter;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.market_wl.databinding.ActivityLoginBinding;
import com.example.market_wl.databinding.ActivityRegisterBinding;
import com.example.market_wl.layout.register.presenter.ui.register.RegisterFragment;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding activityRegisterBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityRegister());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(
                    getActivityRegisterFrameLayout().getId(),
                    RegisterFragment.newInstance()
                )
                .commitNow();
        }
    }

    private ActivityRegisterBinding getActivityRegisterBinding() {
        if (activityRegisterBinding == null) {
            activityRegisterBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        }
        return activityRegisterBinding;
    }

    private ConstraintLayout getActivityRegister() {
        return getActivityRegisterBinding().getRoot();
    }

    private FrameLayout getActivityRegisterFrameLayout() {
        return getActivityRegisterBinding().registerActivityFrameLayout;
    }
}