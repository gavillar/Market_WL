package com.example.market_wl.components;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.market_wl.R;
import com.example.market_wl.utils.displayMetricsUtils.DisplayMetricsUtils;

public class EditTextComponent extends androidx.appcompat.widget.AppCompatEditText {

    DisplayMetricsUtils displayMetricsUtils;

    public EditTextComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFilters(new InputFilter[] {new InputFilter.LengthFilter(20)});
        setPadding(20);
        setTextColor(Color.GRAY);
        setBackground(getResources().getDrawable(R.drawable.edit_text));
    }

    private void setPadding(int value) {
        int padding = getDisplayMetricsUtils().convertToDp(value);
        setPadding(padding, padding, padding, padding);
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
