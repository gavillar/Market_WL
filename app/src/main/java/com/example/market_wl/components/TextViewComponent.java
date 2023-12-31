package com.example.market_wl.components;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.example.market_wl.R;

public class TextViewComponent extends androidx.appcompat.widget.AppCompatTextView {
    public TextViewComponent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setTextColor(Color.BLACK);
        setTypeface(
                ResourcesCompat.getFont(
                        getContext(), R.font.montserrat
                )
        );
    }
}
