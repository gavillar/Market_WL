package com.example.market_wl.layout.payments.ui.payments.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;
import com.example.market_wl.layout.cart.model.Product;
import com.example.market_wl.layout.cart.presenter.ProductViewHolder;
import com.example.market_wl.layout.payments.model.Payment;
import com.example.market_wl.layout.payments.ui.payments.viewHolders.PaymentViewHolder;

import java.util.ArrayList;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentViewHolder> {

    private Context context;

    private ArrayList<Payment> itens;

    public PaymentAdapter(Context context, ArrayList<Payment> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public PaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.item_payment_type, parent, false);
        PaymentViewHolder paymentViewHolder = new PaymentViewHolder(view);

        return paymentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentViewHolder holder, int position) {

        Payment payment = itens.get(position);
        holder.type_Text.setText(payment.getType());

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
