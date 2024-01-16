package com.example.whitelabel.layout.main.cart;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.line_recycler_view.LineRecyclerView;
import com.example.whitelabel.components.linear_layout.VerticalLinearLayout;
import com.example.whitelabel.layout.main.MainContentView;

import java.util.ArrayList;

public class CartContentView extends MainContentView {

    private CartLinearLayout linearLayout;

    public CartContentView(Context context) {
        super(context);
    }

    @Override
    public CartLinearLayout getLinearLayout() {
        if(linearLayout == null) {
            linearLayout = new CartLinearLayout(getContext());
        }
        return linearLayout;
    }
}