package com.example.market_wl.layout.cart.presenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public ImageView product_image;
    public TextView product_name, product_description, product_price;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        product_image = itemView.findViewById(R.id.produtc_image);
        product_name = itemView.findViewById(R.id.product_name);
        product_description = itemView.findViewById(R.id.product_description);
        product_price = itemView.findViewById(R.id.product_price);


    }
}
