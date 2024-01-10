package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.market_wl.components.ButtonComponent;
import com.example.market_wl.components.EditTextComponent;
import com.example.market_wl.components.TextViewComponent;
import com.example.market_wl.extensions.FragmentExtended;


 class RegisterFragment extends FragmentExtended {

    private RegisterViewModel mViewModel;

    private EditTextComponent registerEditText;

    private TextViewComponent registerTextView;

    private ButtonComponent registerNextButton;


    private TextViewComponent toolbarTitle;
    private com.example.market_wl.databinding.FragmentRegisterBinding fragmentRegisterBinding;

    public RegisterFragment(
            ) {
        super();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel();
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

    protected com.example.market_wl.databinding.FragmentRegisterBinding getFragmentRegisterBinding() {
        if(fragmentRegisterBinding == null) {
            fragmentRegisterBinding = com.example.market_wl.databinding.FragmentRegisterBinding.inflate(
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
    protected EditTextComponent getRegisterEditText() {
        if (registerEditText == null) {
            registerEditText = getFragmentRegisterBinding().registerEditText;
        }
        return registerEditText;
    }

    protected TextViewComponent getRegisterTextView() {
        if (registerTextView == null) {
            registerTextView = getFragmentRegisterBinding().registerTextView;
        }
        return registerTextView;
    }

    protected ButtonComponent getRegisterNextButton() {
        if (registerNextButton == null) {
            registerNextButton = getFragmentRegisterBinding().registerNextButton;
        }
        return registerNextButton;
    }



    protected TextViewComponent getToolbarTitle() {
        return toolbarTitle;
    }
}