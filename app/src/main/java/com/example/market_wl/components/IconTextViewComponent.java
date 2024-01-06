package com.example.market_wl.components;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.example.market_wl.R;

public class IconTextViewComponent extends androidx.appcompat.widget.AppCompatTextView {
    public IconTextViewComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(getResources().getColor(R.color.purple));
        setTypeface(
            ResourcesCompat.getFont(
                getContext(), R.font.montserrat
            )
        );
        setTextColor(getResources().getColor(R.color.purple));
        setBackgroundColor(getResources().getColor(R.color.transparent));
        setAllCaps(false);
        setTextSize(25);
    }
}
