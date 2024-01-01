package com.example.market_wl.components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

import com.example.market_wl.R;

public class ButtonComponent extends AppCompatButton {
    public ButtonComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(getResources().getColor(R.color.purple));
        setTypeface(
            ResourcesCompat.getFont(
                getContext(), R.font.montserrat_bold
            )
        );
        setTextColor(Color.WHITE);
        setAllCaps(false);
        setTextSize(20);
    }
}
