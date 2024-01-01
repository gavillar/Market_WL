package com.example.market_wl.layout.login.presenter.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.market_wl.databinding.FragmentLoginBinding;
import com.example.market_wl.layout.home.presenter.ui.home.activity.HomeActivity;


public class LoginFragment extends Fragment {

    private LoginViewModel mViewModel;

    private FragmentLoginBinding fragmentLoginBinding;

    private AppCompatButton loginEnterButton;

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
}