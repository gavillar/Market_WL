package com.example.whitelabel.components.scroll_view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.whitelabel.components.layout_params.RelativeLayoutParams;
import com.example.whitelabel.extensions.LinearLayoutExtended;

public class LinearScrollView extends ScrollView {

    private LinearLayoutExtended linearLayout;

    public LinearScrollView(Context context) {
        super(context);
        super.addView(getLinearLayout());
    }

    @Override
    public void addView(View child) {
        getLinearLayout().addView(child);
    }

    public LinearLayoutExtended getLinearLayout() {
        if(linearLayout == null) {
            linearLayout = new LinearLayoutExtended(getContext()) {};
            final RelativeLayoutParams layoutParams = (
                    RelativeLayoutParams.line()
            );
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
        }
        return linearLayout;
    }
}
