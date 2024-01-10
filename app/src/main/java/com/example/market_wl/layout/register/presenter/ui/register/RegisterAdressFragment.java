package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market_wl.R;
import com.example.market_wl.interfaces.RegisterNavigation;


public class RegisterAdressFragment extends RegisterFragment implements RegisterNavigation {

    private com.example.market_wl.databinding.FragmentRegisterBinding fragmentRegisterBinding;

    public RegisterAdressFragment() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setRegisterEditText();
        setRegisterTextView();
        setNextButton();
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

    private void setRegisterEditText() {
        getRegisterEditText().setHint(getResources().getText(R.string.cep));
    }

    private void setRegisterTextView() {
        getRegisterTextView().setText(getResources().getText(R.string.qual_o_seu_cep));
    }

    @Override
    public void setNextButton() {

    }

    @Override
    public void setBackButton() {

    }
}