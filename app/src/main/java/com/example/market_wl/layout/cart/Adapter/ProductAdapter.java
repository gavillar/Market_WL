package com.example.market_wl.layout.cart.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;
import com.example.market_wl.layout.cart.model.Product;
import com.example.market_wl.layout.cart.presenter.ProductViewHolder;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private Context context;
    private ArrayList<Product> itens;

    public ProductAdapter(Context context, ArrayList<Product> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_product_in_cart, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);


        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = itens.get(position);
      // holder.product_image.setImage(product.getImage());
       holder.product_name.setText(product.getName());
       holder.product_description.setText(product.getDescription());
       holder.product_price.setText(product.getPrice());

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
