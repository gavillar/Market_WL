package com.example.market_wl.components;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

import com.example.market_wl.R;

public class CleanButtonComponent extends AppCompatButton {
    public CleanButtonComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(getResources().getColor(R.color.purple));
        setTypeface(
            ResourcesCompat.getFont(
                getContext(), R.font.montserrat
            )
        );
        setTextColor(Color.BLACK);
        setGravity(Gravity.END);
        setTextColor(getResources().getColor(R.color.purple));
        setBackgroundColor(getResources().getColor(R.color.transparent));
        setAllCaps(false);
        setTextSize(20);
    }
}
