package com.example.whitelabel.components;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.whitelabel.R;
import com.example.whitelabel.utils.TextViewUtils;

public class TextViewComponent extends AppCompatTextView {

    public TextViewComponent(@NonNull Context context) {
        super(context);
        setTypeface(TextViewUtils.getDefaultTypeface(context));
        setTextSize(TextViewUtils.getDefaultBigTextSize());
        setTextColor(getResources().getColor(R.color.black));
    }
}