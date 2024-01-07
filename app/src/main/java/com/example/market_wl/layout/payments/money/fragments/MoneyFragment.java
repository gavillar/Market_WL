package com.example.market_wl.layout.payments.money.fragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market_wl.R;
import com.example.market_wl.components.ButtonComponent;
import com.example.market_wl.databinding.FragmentLoginBinding;
import com.example.market_wl.layout.payments.money.viewModels.MoneyViewModel;

public class MoneyFragment extends Fragment {

    private MoneyViewModel mViewModel;

    View view;


    private ButtonComponent confirmButton;

    public static MoneyFragment newInstance() {
        return new MoneyFragment();
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_money, container, false);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MoneyViewModel.class);
        // TODO: Use the ViewModel
    }


    private void setConfirmButton() {



    }


}