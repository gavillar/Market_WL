package com.example.whitelabel.components.button;

import static android.view.Gravity.CENTER;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.whitelabel.extensions.ButtonExtended;

public class IconButton extends ButtonExtended {

    public IconButton(@NonNull Context context) {
        super(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
            getResources().getDisplayMetrics().heightPixels / 20,
            getResources().getDisplayMetrics().heightPixels / 20
        );
        setLayoutParams(layoutParams);
        setGravity(CENTER);
    }
}