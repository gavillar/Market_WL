package com.example.whitelabel.components.linear_layout;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.layout_params.LinearLayoutParams;

public class HorizontalLinearLayout extends LinearLayout {

    public HorizontalLinearLayout(Context context) {
        super(context);
        setLayoutParams(LinearLayoutParams.wrap());
    }
}