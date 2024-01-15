package com.example.whitelabel.extensions;

import static android.view.Gravity.CENTER;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import com.example.whitelabel.R;

public class ButtonExtended extends AppCompatButton {

    public ButtonExtended(@NonNull Context context) {
        super(context);
    }

    public void setBackgroundDrawable(@DrawableRes int id) {
        super.setBackgroundDrawable(
            ContextCompat.getDrawable(getContext(), id)
        );
    }

    public void setBackground(@DrawableRes int id) {
        super.setBackground(
                ContextCompat.getDrawable(
                        getContext(), id
                )
        );
    }
}