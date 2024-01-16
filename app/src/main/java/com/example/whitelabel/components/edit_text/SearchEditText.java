package com.example.whitelabel.components.edit_text;

import android.content.Context;
import android.view.Gravity;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;

import com.example.whitelabel.R;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.extensions.EditTextExtended;
import com.example.whitelabel.utils.LayoutParamsUtils;
import com.example.whitelabel.utils.TextViewUtils;

public class SearchEditText extends EditTextExtended {

    public SearchEditText(@NonNull Context context) {
        super(context);
        setTextSize(TextViewUtils.getDefaultTextSize());
        setBackground(R.drawable.edit_text_search);
        setTypeface(TextViewUtils.getDefaultTypeface(context));
        setLayoutParams(
            LinearLayoutParams.line(
                LayoutParamsUtils.getActionBarHeight(getContext())
            )
        );
        setFocusable(true);
        setFocusableInTouchMode(true);
        setGravity(Gravity.CENTER_VERTICAL);
        setOnFocusChangeListener(
            (view, hasFocus) -> {
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
            }
        );
        setCompoundDrawablesWithIntrinsicBounds(
                ContextCompat.getDrawable(getContext(), R.drawable.ic_lupe),
                null,
                null,
                null
        );
    }
}
