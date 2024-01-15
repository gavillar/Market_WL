package com.example.whitelabel.utils;

import android.content.Context;
import android.util.TypedValue;

public abstract class LayoutParamsUtils {

    public static int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
        return context.getResources().getDimensionPixelSize(typedValue.resourceId);
    }
}
