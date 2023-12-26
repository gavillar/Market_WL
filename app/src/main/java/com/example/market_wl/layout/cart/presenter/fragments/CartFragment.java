package com.example.market_wl.layout.cart.presenter.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.market_wl.R;
import com.example.market_wl.layout.cart.Adapter.ProductAdapter;
import com.example.market_wl.layout.cart.model.Product;

import java.util.ArrayList;


public class CartFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> itens;



    public CartFragment() {
        // Required empty public constructor
    }

    public static CartFragment newInstance(String param1, String param2) {
        CartFragment fragment = new CartFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        itens = new ArrayList<Product>();
        itens.add(new Product(0, "Mortadela", "100g", "RS 3,00"));
        itens.add(new Product(0, "Pão WickBold", "Integral", "RS 14,00"));
        itens.add(new Product(0, "Leite UHT", "Jussara", "RS 5,00"));
        itens.add(new Product(0, "Café", "3 Corações", "RS 16,00"));


        productAdapter = new ProductAdapter(requireContext(), itens);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView = view.findViewById(R.id.recycler_view_cart);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(productAdapter);

        return view;
    }
}