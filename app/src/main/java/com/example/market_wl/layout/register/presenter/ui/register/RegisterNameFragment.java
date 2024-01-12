package com.example.market_wl.layout.register.presenter.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.market_wl.R;
import com.example.market_wl.interfaces.RegisterNavigation;


public class RegisterNameFragment extends RegisterFragment implements RegisterNavigation {

    NavController navController;
    public RegisterNameFragment() {
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
        setRegisterEditText();
        setRegisterTextView();
        setNextButton();

        return getFragmentRegisterBinding().getRoot();
    }

    @Override
    public void setNavigation() {
        navController = NavHostFragment.findNavController(this);
    }
    private void setRegisterEditText() {
        getRegisterEditText().setHint(getResources().getText(R.string.nome));
    }

    private void setRegisterTextView() {
        getRegisterTextView().setText(getResources().getText(R.string.qual_o_seu_nome));
    }


    @Override
    public void setNextButton() {
        getRegisterNextButton().setOnClickListener(
                view -> {
                    navController.navigate(R.id.action_registerNameFragment_to_registerEmailFragment);
                }
        );
    }

    @Override
    public void setBackButton() {
        navController.popBackStack();
    }
}