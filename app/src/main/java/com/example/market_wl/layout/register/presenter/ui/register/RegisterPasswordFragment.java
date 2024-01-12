package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market_wl.R;
import com.example.market_wl.extensions.FragmentExtended;
import com.example.market_wl.interfaces.RegisterNavigation;
import com.example.market_wl.interfaces.RegisterSetAttributes;


public class RegisterPasswordFragment extends RegisterFragment implements RegisterSetAttributes, RegisterNavigation {

    NavController navController;

    public static RegisterPasswordFragment newInstance(String param1, String param2) {
        RegisterPasswordFragment fragment = new RegisterPasswordFragment();


        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setNavigation();
        setNextButton();
        setBackButton();
        setRegisterTextView();
        setRegisterEditText();

        return getFragmentRegisterBinding().getRoot();
    }


    @Override
    public void setNavigation() {
        navController = NavHostFragment.findNavController(this);
    }

    @Override
    public void setNextButton() {
        getRegisterNextButton().setOnClickListener(
                view -> {

                }
        );
    }

    @Override
    public void setBackButton() {

    }

    @Override
    public void setRegisterEditText() {
        getRegisterEditText().setText("Senha");
    }

    @Override
    public void setRegisterTextView() {
        getRegisterTextView().setHint("Escolha uma senha.");
    }
}