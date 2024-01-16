package com.example.whitelabel.layout.main;

import android.content.Context;

import com.example.whitelabel.components.linear_layout.VerticalLinearLayout;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;

public class MainLinearLayout extends VerticalLinearLayout {

    public MainLinearLayout(Context context) {
        super(context);
        final LinearLayoutParams layoutParams = LinearLayoutParams.line();
        layoutParams.weight = 1;
        setLayoutParams(layoutParams);
    }
}