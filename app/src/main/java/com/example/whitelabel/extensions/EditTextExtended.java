package com.example.whitelabel.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;

import com.example.whitelabel.R;

public abstract class EditTextExtended extends AppCompatEditText {

    public EditTextExtended(@NonNull Context context) {
        super(context);
    }

    public void setBackground(@DrawableRes int id) {
        setBackground(
                ContextCompat.getDrawable(
                        getContext(), id
                )
        );
    }
}