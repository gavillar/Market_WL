package com.example.market_wl.layout.login.presenter;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.market_wl.databinding.ActivityLoginBinding;
import com.example.market_wl.layout.login.presenter.ui.login.LoginFragment;
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding activityLoginBinding;

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLogin());
        setNavController();
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                .replace(
//                    getLoginActivityFragmentContainerView().getId(),
//                    LoginFragment.newInstance()
//                )
//                .commitNow();
//        }
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

    private FrameLayout getLoginActivityFragmentContainerView() {
        return getActivityLoginBinding().loginActivityFragmentContainerView;
    }

    public void setNavController() {
        if(navController == null) {
            final NavHostFragment navHostFragment = (
                    (NavHostFragment) getSupportFragmentManager()
                            .findFragmentById(
                                    getLoginActivityFragmentContainerView()
                                            .getId()
                            )
            );
            assert navHostFragment != null;
            navController = (
                    navHostFragment
                            .getNavController()
            );
        }
    }
}