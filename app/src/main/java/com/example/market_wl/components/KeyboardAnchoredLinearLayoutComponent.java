package com.example.market_wl.components;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.market_wl.utils.displayMetricsUtils.DisplayMetricsUtils;

public class KeyboardAnchoredLinearLayoutComponent extends LinearLayout {

    DisplayMetricsUtils displayMetricsUtils;

    public KeyboardAnchoredLinearLayoutComponent(
            Context context, @Nullable AttributeSet attrs
    ) {
        super(context, attrs);
        setOrientation(VERTICAL);
    }

    private DisplayMetricsUtils getDisplayMetricsUtils() {
        if(displayMetricsUtils == null) {
            displayMetricsUtils = (
                    new DisplayMetricsUtils(this)
            );
        }
        return displayMetricsUtils;
    }
}
