package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.market_wl.R;
import com.example.market_wl.components.TextViewComponent;
import com.example.market_wl.layout.register.interfaces.RegisterNavigation;


public class RegisterCpfFragment extends RegisterFragment implements RegisterNavigation {

    public RegisterCpfFragment(TextViewComponent toolbarTitle) {
        super(toolbarTitle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        setRegisterEditText();
        setRegisterTextView();
        setRegisterNextButton();
        getToolbarTitle().setText(getResources().getText(R.string.cpf));
        return getFragmentRegisterBinding().getRoot();
    }
    private void setRegisterEditText() {
        getRegisterEditText().setHint(getResources().getText(R.string.cpf));
    }

    private void setRegisterTextView() {
        getRegisterTextView().setText(getResources().getText(R.string.qual_o_seu_cpf));
    }


    @Override
    public void setRegisterNextButton() {
        getRegisterNextButton().setOnClickListener(
                view -> {
                    replaceFragment(
                            R.id.registerActivityFrameLayout,
                            new RegisterAdressFragment(getToolbarTitle())
                    );
                }
        );
    }
}