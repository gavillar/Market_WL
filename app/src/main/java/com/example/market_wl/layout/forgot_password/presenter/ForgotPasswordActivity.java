package com.example.market_wl.layout.forgot_password.presenter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.market_wl.databinding.ActivityForgotPasswordBinding;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ActivityForgotPasswordBinding activityForgotPasswordBinding;
    private NavController navController;
    private FragmentContainerView forgotPasswordActivityFragmentContainerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityForgotPasswordBinding().getRoot());
    }

    private ActivityForgotPasswordBinding getActivityForgotPasswordBinding() {
        if(activityForgotPasswordBinding == null) {
            activityForgotPasswordBinding = (
                    ActivityForgotPasswordBinding.inflate(getLayoutInflater())
            );
        }
        return activityForgotPasswordBinding;
    }

    private void setNavController() {
        if(navController == null) {
            final NavHostFragment navHostFragment = (
                    (NavHostFragment) getSupportFragmentManager()
                            .findFragmentById(
                                    getForgotPasswordActivityFragmentContainerView()
                                            .getId()
                            )
            );
            assert navHostFragment != null;
            navController = navHostFragment.getNavController();
        }
    }
    private FragmentContainerView getForgotPasswordActivityFragmentContainerView() {if(forgotPasswordActivityFragmentContainerView == null) {
            forgotPasswordActivityFragmentContainerView = (
                    getActivityForgotPasswordBinding()
                            .forgotPasswordActivityFragmentContainerView
            );
        }
        return forgotPasswordActivityFragmentContainerView;
    }
}
