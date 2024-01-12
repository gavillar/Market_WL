package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.market_wl.R;
import com.example.market_wl.interfaces.RegisterNavigation;


public class RegisterCpfFragment extends RegisterFragment implements RegisterNavigation {

    NavController navController;

    public RegisterCpfFragment() {
        super();
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
        setNavigation();
        setNextButton();
        setBackButton();
        setRegisterEditText();
        setRegisterTextView();

        return getFragmentRegisterBinding().getRoot();
    }
    private void setRegisterEditText() {
        getRegisterEditText().setHint(getResources().getText(R.string.cpf));
    }

    private void setRegisterTextView() {
        getRegisterTextView().setText(getResources().getText(R.string.qual_o_seu_cpf));
    }


    @Override
    public void setNavigation() {
        navController = NavHostFragment.findNavController(this);
    }

    @Override
    public void setNextButton() {
        getRegisterNextButton().setOnClickListener(
                view -> {
                    navController.navigate(R.id.action_registerCpfFragment_to_registerAdressFragment);
                }
        );
    }

    @Override
    public void setBackButton() {

    }
}