package com.example.market_wl.layout.payments.ui.payments.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;
import com.example.market_wl.interfaces.OnItemClickListener;

public class PaymentViewHolder extends RecyclerView.ViewHolder  {

    public TextView type_Text;


    public PaymentViewHolder(@NonNull View itemView) {
        super(itemView);
        type_Text = itemView.findViewById(R.id.text_paymentType);
    }
}
