package com.example.market_wl.layout.forgot_password.presenter.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.market_wl.R;
import com.example.market_wl.components.EditTextComponent;
import com.example.market_wl.components.TextViewComponent;
import com.example.market_wl.databinding.FragmentForgotPasswordBinding;

public class ForgotPasswordFragment extends Fragment {


    private EditTextComponent forgotPasswordEditText;
    private TextViewComponent forgotPasswordTextView;
    private FragmentForgotPasswordBinding fragmentForgotPasswordBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setForgotPasswordTextView();
        setForgotPasswordEditText();
        return getFragmentForgotPasswordBinding().getRoot();
    }

    private FragmentForgotPasswordBinding getFragmentForgotPasswordBinding() {
        if(fragmentForgotPasswordBinding == null) {
            fragmentForgotPasswordBinding = (
                FragmentForgotPasswordBinding.inflate(getLayoutInflater())
            );
        }
        return fragmentForgotPasswordBinding;
    }
    private void setForgotPasswordTextView() {
        if(forgotPasswordTextView == null) {
            forgotPasswordTextView = (
                    getFragmentForgotPasswordBinding().forgotPasswordTextView
            );
            forgotPasswordTextView.setText(
                    getResources().getText(R.string.qual_o_seu_email)
            );
        }
    }

    private void setForgotPasswordEditText() {
        if(forgotPasswordEditText == null) {
            forgotPasswordEditText = (
                    getFragmentForgotPasswordBinding().forgotPasswordEditText
            );
            forgotPasswordEditText.setHint(
                    getResources().getText(R.string.email)
            );
        }
    }
}
