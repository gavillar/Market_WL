package com.example.whitelabel.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.whitelabel.extensions.LinearLayoutExtended;

public class ScrollViewComponent extends ScrollView {

    private LinearLayoutExtended linearLayout;

    public ScrollViewComponent(Context context) {
        super(context);
        super.addView(getLinearLayout());
    }

    @Override
    public void addView(View child) {
        getLinearLayout().addView(child);
    }

    public LinearLayoutExtended getLinearLayout() {
        if(linearLayout == null) {
            linearLayout = new LinearLayoutExtended(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
        }
        return linearLayout;
    }
}
