package com.example.whitelabel.utils;

import android.content.Context;
import android.graphics.Typeface;

import androidx.core.content.res.ResourcesCompat;

import com.example.whitelabel.R;

public abstract class TextViewUtils {

    public static int getDefaultTextSize() {
        return 20;
    };

    public static int getDefaultBigTextSize() {
        return 25;
    };

    public static Typeface getDefaultTypeface(
            Context context
    ) {
        return ResourcesCompat.getFont(context, R.font.montserrat);
    };

    public static Typeface getDefaultBoldTypeface(
            Context context
    ) {
        return ResourcesCompat.getFont(context, R.font.montserrat_bold);
    };
}