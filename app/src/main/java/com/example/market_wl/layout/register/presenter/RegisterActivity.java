package com.example.market_wl.layout.register.presenter;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.market_wl.components.TextViewComponent;
import com.example.market_wl.databinding.ActivityRegisterBinding;
import com.example.market_wl.layout.register.presenter.ui.register.RegisterNameFragment;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding activityRegisterBinding;
    private TextViewComponent registerToolbarTitle;
    private ImageView registerToolbarBack;
    private ImageView registerToolbarExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityRegister());
        setRegisterToolBarBack();
        setRegisterToolBarExit();
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                .replace(
//                    getActivityRegisterFrameLayout().getId(),
//                    new RegisterNameFragment(getRegisterToolbarTitle())
//                )
//                .commitNow();
//        }
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

    private void setRegisterToolBarBack() {
        if(registerToolbarBack == null) {
            registerToolbarBack = (
                getActivityRegisterBinding().registerToolbarBack
            );
            registerToolbarBack.setOnClickListener(
                    view -> {
                        onBackPressed();
                    }
            );
        }
    }

    private void setRegisterToolBarExit() {
        if(registerToolbarExit == null) {
            registerToolbarExit = (
                    getActivityRegisterBinding().registerToolbarExit
            );
            registerToolbarExit.setOnClickListener(
                    view -> {
                        onBackPressed();
                    }
            );
        }
    }
    private TextViewComponent getRegisterToolbarTitle() {
        if(registerToolbarTitle == null) {
            registerToolbarTitle = (
                    getActivityRegisterBinding().registerToolbarTitle
            );
            registerToolbarTitle.setOnClickListener(
                    view -> {
                        onBackPressed();
                    }
            );
        }
        return registerToolbarTitle;
    }
}