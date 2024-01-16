package com.example.whitelabel.components.edit_text;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.whitelabel.R;
import com.example.whitelabel.extensions.EditTextExtended;
import com.example.whitelabel.utils.LayoutParamsUtils;
import com.example.whitelabel.utils.TextViewUtils;

public class EditTextComponent extends EditTextExtended {

    public EditTextComponent(@NonNull Context context) {
        super(context);
        setTextSize(TextViewUtils.getDefaultTextSize());
        setBackground(R.drawable.edit_text);
        setTypeface(TextViewUtils.getDefaultTypeface(context));
        setLayoutParams(
            new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                LayoutParamsUtils.getDefaultEditTextHeight(getContext())
            )
        );
        setFocusable(true);
        setFocusableInTouchMode(true);
        setGravity(Gravity.CENTER_VERTICAL);
        setOnFocusChangeListener(
            (view, hasFocus) -> {
                if (!hasFocus) {
                    clearFocus();
                }
            }
        );
    }
}
