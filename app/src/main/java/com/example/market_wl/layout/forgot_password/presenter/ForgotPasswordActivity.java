package com.example.market_wl.layout.forgot_password.presenter;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.market_wl.components.TextViewComponent;
import com.example.market_wl.databinding.ActivityForgotPasswordBinding;

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextViewComponent forgotPasswordToolbarTitle;
    private ActivityForgotPasswordBinding activityForgotPasswordBinding;
    private NavController navController;
    private FragmentContainerView forgotPasswordActivityFragmentContainerView;
    private ImageView forgotPasswordToolbarBack;
    private ImageView forgotPasswordToolbarExit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setForgotPasswordToolbarBack();
        setForgotPasswordToolbarExit();
        setNavController();
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
            navController.addOnDestinationChangedListener(
                (controller, destination, bundle) -> {
                    getForgotPasswordToolbarTitle().setText(
                            destination.getLabel()
                    );
                }
            );
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

    private TextViewComponent getForgotPasswordToolbarTitle() {
        if(forgotPasswordToolbarTitle == null) {
            forgotPasswordToolbarTitle = (
                    getActivityForgotPasswordBinding()
                            .forgotPasswordToolbarTitle
            );
        }
        return forgotPasswordToolbarTitle;
    }
    private void setForgotPasswordToolbarBack() {
        if(forgotPasswordToolbarBack == null) {
            forgotPasswordToolbarBack = (
                    getActivityForgotPasswordBinding()
                            .forgotPasswordToolbarBack
            );
            forgotPasswordToolbarBack.setOnClickListener(
                    view -> onBackPressed()
            );
        }
    }

    private void setForgotPasswordToolbarExit() {
        if(forgotPasswordToolbarExit == null) {
            forgotPasswordToolbarExit = (
                    getActivityForgotPasswordBinding()
                            .forgotPasswordToolbarExit
            );
            forgotPasswordToolbarExit.setOnClickListener(
                    view -> onBackPressed()
            );
        }
    }
}
