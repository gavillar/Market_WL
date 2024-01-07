package com.example.market_wl.layout.payments.ui.payments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;
import com.example.market_wl.components.ButtonComponent;
import com.example.market_wl.layout.payments.model.Payment;
import com.example.market_wl.layout.payments.ui.payments.adapter.PaymentAdapter;
import com.example.market_wl.layout.payments.ui.payments.viewModels.PaymentsViewModel;

import java.util.ArrayList;

public class PaymentsFragment extends Fragment {

    View view;
    private PaymentsViewModel mViewModel;


    private RecyclerView recyclerView;

    private PaymentAdapter paymentAdapter;

    private ArrayList<Payment> itens;

    private ButtonComponent confirmButton;



    public static PaymentsFragment newInstance() {
        return new PaymentsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PaymentsViewModel.class);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {




        view = inflater.inflate(R.layout.fragment_payments, container, false);

        itens = new ArrayList<Payment>();
        itens.add(new Payment("Dinheiro"));
        itens.add(new Payment("Débito"));
        itens.add(new Payment("Crédito"));
        itens.add(new Payment("Pix"));


        PaymentAdapter PaymentAdapter = new PaymentAdapter(requireContext(), itens);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView = view.findViewById(R.id.recycler_view_payments);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(PaymentAdapter);


        setConfirmButton();
        return view;
    }

    private void setConfirmButton() {

        confirmButton = view.findViewById(R.id.confirm_payment_button);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireView());
                navController.navigate(R.id.money_Fragment);
            }
        });
    }

}

