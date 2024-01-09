package com.example.market_wl.layout.forgot_password.presenter.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.market_wl.databinding.FragmentForgotPasswordBinding;

public class ForgotPasswordFragment extends Fragment {

    private FragmentForgotPasswordBinding fragmentForgotPasswordBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getFragmentForgotPasswordBinding().getRoot();
    }

    public FragmentForgotPasswordBinding getFragmentForgotPasswordBinding() {
        if(fragmentForgotPasswordBinding == null) {
            fragmentForgotPasswordBinding = (
                FragmentForgotPasswordBinding.inflate(getLayoutInflater())
            );
        }
        return fragmentForgotPasswordBinding;
    }
}
