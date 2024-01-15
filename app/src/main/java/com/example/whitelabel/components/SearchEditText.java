package com.example.whitelabel.components;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;

import com.example.whitelabel.R;
import com.example.whitelabel.utils.EditTextUtils;
import com.example.whitelabel.utils.TextViewUtils;

public class SearchEditText extends AppCompatEditText {

    public SearchEditText(@NonNull Context context) {
        super(context);
        setTextSize(TextViewUtils.getDefaultTextSize());
        setBackground(
                ContextCompat.getDrawable(
                        context, R.drawable.edit_text_search
                )
        );
        setTypeface(TextViewUtils.getDefaultTypeface(context));
        setLayoutParams(
            new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                EditTextUtils.getDefaultHeight()
            )
        );
        setFocusable(true);
        setFocusableInTouchMode(true);
        setGravity(Gravity.CENTER_VERTICAL);
        setOnFocusChangeListener((view, hasFocus) -> {
            if (!hasFocus) {
                InputMethodManager inputMethodManager = (
                        (InputMethodManager) context
                                .getSystemService(
                                        Context.INPUT_METHOD_SERVICE
                                )
                );
                inputMethodManager.hideSoftInputFromWindow(
                        view.getWindowToken(), 0
                );
            }
        });
    }
}
