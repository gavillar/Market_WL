package com.example.whitelabel.components.button;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

import com.example.whitelabel.R;
import com.example.whitelabel.utils.LayoutParamsUtils;
import com.example.whitelabel.utils.TextViewUtils;

public class CleanButton extends AppCompatButton {

    public CleanButton(@NonNull Context context) {
        super(context);
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                LayoutParamsUtils.getDefaultCleanButtonHeight(getContext())
        );
        setLayoutParams(layoutParams);
        setTextColor(getResources().getColor(R.color.blue));
        setGravity(Gravity.CENTER_VERTICAL);
        setTextSize(TextViewUtils.getDefaultTextSize());
    }
}
