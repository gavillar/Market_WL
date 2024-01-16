package com.example.whitelabel.utils;

import android.content.Context;
import android.util.TypedValue;

public abstract class LayoutParamsUtils {

    public static int getDefaultEditTextHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels/8;
    };

    public static int getDefaultBaseButtonHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels/8;
    };

    public static int getDefaultCleanButtonHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels/15;
    };

    public static int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
        return context.getResources().getDimensionPixelSize(typedValue.resourceId);
    }
}
