package com.example.whitelabel.extensions;

import android.content.Context;
import android.widget.LinearLayout;

import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

public class LinearLayoutExtended extends LinearLayout {

    public LinearLayoutExtended(Context context) {
        super(context);
    }

    public void setPadding() {
        setPadding(75, 180, 75, 0);
    }

    public void setBackground(@DrawableRes int id) {
        super.setBackground(
                ContextCompat.getDrawable(getContext(), id)
        );
    }
}