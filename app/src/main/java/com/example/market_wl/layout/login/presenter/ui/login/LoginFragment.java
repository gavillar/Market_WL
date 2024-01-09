package com.example.market_wl.layout.login.presenter.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProvider;

import com.example.market_wl.databinding.FragmentLoginBinding;
import com.example.market_wl.extensions.FragmentExtended;
import com.example.market_wl.layout.forgot_password.presenter.ForgotPasswordActivity;
import com.example.market_wl.layout.home.presenter.ui.home.activity.HomeActivity;
import com.example.market_wl.layout.register.presenter.RegisterActivity;


public class LoginFragment extends FragmentExtended {

    private LoginViewModel mViewModel;

    private FragmentLoginBinding fragmentLoginBinding;

    private AppCompatButton loginEnterButton;

    private AppCompatButton registerButton;

    private AppCompatButton forgotPasswordButton;

    private LinearLayout loginScrollArea;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel();
        // TODO: Use the ViewModel
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        setEnterButton();
        setLoginScrollArea();
        setRegisterButton();
        setForgotPasswordButton();
        return getFragmentLoginBinding().getRoot();
    }

    private FragmentLoginBinding getFragmentLoginBinding() {
        if(fragmentLoginBinding == null) {
            fragmentLoginBinding = FragmentLoginBinding.inflate(
                    getLayoutInflater()
            );
        }
        return fragmentLoginBinding;
    }

    private void setViewModel() {
        if (mViewModel == null) {
            mViewModel = (
                new ViewModelProvider(this)
                    .get(LoginViewModel.class)
            );
        }
    }

    private void setEnterButton() {
        if (loginEnterButton == null) {
            loginEnterButton = (
                getFragmentLoginBinding()
                    .loginEnterButton
            );
            loginEnterButton.setOnClickListener(
                    view -> {
                        Intent intent = new Intent(
                            getContext(),
                            HomeActivity.class
                        );
                        startActivity(intent);
                    }
            );
        }
    }

    private void setLoginScrollArea() {
        if(loginScrollArea == null) {
            loginScrollArea = (
                    getFragmentLoginBinding()
                            .loginScrollArea
            );
            loginScrollArea.setOnClickListener(
                (view) -> {
                    hideKeyboard();
                }
            );
        }
    }

    private void setRegisterButton() {
        if(registerButton == null) {
            registerButton = (
                    getFragmentLoginBinding().registerButton
            );
            registerButton.setOnClickListener(
                    (view) -> {
                        Intent intent = new Intent(
                                getContext(),
                                RegisterActivity.class
                        );
                        startActivity(intent);
                    }
            );
        }
    }

    public void setForgotPasswordButton() {
        if(forgotPasswordButton == null) {
            forgotPasswordButton = (
                    getFragmentLoginBinding().forgotPasswordButton
            );
            forgotPasswordButton.setOnClickListener(
                    (view) -> {
                        Intent intent = new Intent(
                                getContext(),
                                ForgotPasswordActivity.class
                        );
                        startActivity(intent);
                    }
            );
        }
    }
}