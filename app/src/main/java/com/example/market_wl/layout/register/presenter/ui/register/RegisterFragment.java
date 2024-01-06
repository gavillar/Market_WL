package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.market_wl.databinding.FragmentRegisterBinding;
import com.example.market_wl.extensions.FragmentExtended;


public class RegisterFragment extends FragmentExtended {

    private RegisterViewModel mViewModel;

    private FragmentRegisterBinding fragmentRegisterBinding;

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
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
        return getFragmentRegisterBinding().getRoot();
    }

    private FragmentRegisterBinding getFragmentRegisterBinding() {
        if(fragmentRegisterBinding == null) {
            fragmentRegisterBinding = FragmentRegisterBinding.inflate(
                    getLayoutInflater()
            );
        }
        return fragmentRegisterBinding;
    }

    private void setViewModel() {
        if (mViewModel == null) {
            mViewModel = (
                new ViewModelProvider(this)
                    .get(RegisterViewModel.class)
            );
        }
    }
}