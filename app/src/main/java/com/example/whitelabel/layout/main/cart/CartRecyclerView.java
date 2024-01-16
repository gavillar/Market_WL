package com.example.whitelabel.layout.main.cart;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.line_recycler_view.LineRecyclerView;

import java.util.ArrayList;

public class CartRecyclerView extends LineRecyclerView {

    public CartRecyclerView(@NonNull Context context) {
        super(context);
    }

    @Override
    public ArrayList<View> getItems() {
        final LinearLayout linearLayout = (
                new LinearLayout(getContext())
        );
        linearLayout.setLayoutParams(
                LinearLayoutParams.line(200)
        );
        linearLayout.setBackgroundColor(Color.BLUE);
        final ArrayList<View> cells = new ArrayList<>();
        cells.add(linearLayout);
        return cells;
    }
}