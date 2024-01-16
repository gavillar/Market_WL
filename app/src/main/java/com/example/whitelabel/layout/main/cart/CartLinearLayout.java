package com.example.whitelabel.layout.main.cart;

import android.content.Context;

import com.example.whitelabel.components.line_recycler_view.LineRecyclerView;
import com.example.whitelabel.layout.main.MainLinearLayout;

public class CartLinearLayout extends MainLinearLayout {

    private LineRecyclerView recyclerView;

    public CartLinearLayout(Context context) {
        super(context);
        addView(getRecyclerView());
    }

    public LineRecyclerView getRecyclerView() {
        if(recyclerView == null) {
            recyclerView = new CartRecyclerView(getContext());
        }
        return recyclerView;
    }
}