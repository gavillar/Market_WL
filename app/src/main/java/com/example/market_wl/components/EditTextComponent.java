package com.example.market_wl.components;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.market_wl.R;

public class EditTextComponent extends androidx.appcompat.widget.AppCompatEditText {

    public EditTextComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFilters(new InputFilter[] {new InputFilter.LengthFilter(20)});
        setPadding(20);
        setBackground(getResources().getDrawable(R.drawable.edit_text));
    }

    public void setPadding(int valueDp) {
        float scale = getResources().getDisplayMetrics().density;
        int padding = (int) (valueDp * scale + 0.5f);
        setPadding(padding, padding, padding, padding);
    }
}
