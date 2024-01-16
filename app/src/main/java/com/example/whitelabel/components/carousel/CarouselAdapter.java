package com.example.whitelabel.components.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whitelabel.components.layout_params.RelativeLayoutParams;
import com.example.whitelabel.components.linear_layout.VerticalLinearLayout;

import java.util.ArrayList;

public class CarouselAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<View> items;
    private final Context context;

    public CarouselAdapter(Context context, ArrayList<View> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        VerticalLinearLayout layout = new VerticalLinearLayout(context) {};
        layout.setLayoutParams(RelativeLayoutParams.line());
        return new RecyclerView.ViewHolder(layout) {};
    }

    @Override
    public void onBindViewHolder(
            @NonNull RecyclerView.ViewHolder viewHolder,
            int position
    ) {
        VerticalLinearLayout itemView = (VerticalLinearLayout) viewHolder.itemView;
        if (itemView.getChildCount() > 0) {
            itemView.removeAllViews();
        }
        itemView.addView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}