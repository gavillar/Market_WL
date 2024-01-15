package com.example.whitelabel.extensions;

import android.content.Context;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;

public class ImageViewExtended extends AppCompatImageView {

    public ImageViewExtended(@NonNull Context context) {
        super(context);
    }

    public void setImageDrawable(final int id) {
        super.setImageDrawable(
                ContextCompat.getDrawable(getContext(), id)
        );
    }
}
