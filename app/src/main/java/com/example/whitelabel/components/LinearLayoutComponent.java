package com.example.whitelabel.components;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.layout_params.LinearLayoutParams;

public class LinearLayoutComponent extends LinearLayout {

    public LinearLayoutComponent(Context context) {
        super(context);
        setLayoutParams(LinearLayoutParams.wrap());
    }
}