package com.example.whitelabel.components;

import static android.view.Gravity.CENTER;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.whitelabel.R;
import com.example.whitelabel.extensions.ButtonExtended;
import com.example.whitelabel.utils.ButtonUtils;
import com.example.whitelabel.utils.LayoutParamsUtils;
import com.example.whitelabel.utils.TextViewUtils;

public class BaseButton extends ButtonExtended {

    public BaseButton(@NonNull Context context) {
        super(context);
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ButtonUtils.getDefaultBaseButtonHeight()
        );
        setLayoutParams(layoutParams);
        setTypeface(TextViewUtils.getDefaultBoldTypeface(getContext()));
        setBackground(R.drawable.base_button);
        setTextColor(getResources().getColor(R.color.white));
        setText(R.string.continuar);
        setGravity(CENTER);
        setTextSize(TextViewUtils.getDefaultBigTextSize());
    }
}
