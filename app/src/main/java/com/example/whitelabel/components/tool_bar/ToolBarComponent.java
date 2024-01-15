package com.example.whitelabel.components.tool_bar;

import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.example.whitelabel.R;
import com.example.whitelabel.utils.LayoutParamsUtils;

class ToolBarComponent extends LinearLayout {

    public ToolBarComponent(Context context) {
        super(context);
        final LayoutParams layoutParams = new LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParamsUtils.getActionBarHeight(getContext())
        );
        layoutParams.weight = 0;
        setPadding(20,0,20,0);
        setLayoutParams(layoutParams);
        setBackgroundColor(getResources().getColor(R.color.white));
        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);
    }
}