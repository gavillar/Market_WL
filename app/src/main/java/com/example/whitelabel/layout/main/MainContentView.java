package com.example.whitelabel.layout.main;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.R;
import com.example.whitelabel.components.linear_layout.VerticalLinearLayout;
import com.example.whitelabel.components.bottom_bar.BottomBar;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;

public class MainContentView extends LinearLayout {

    private ActionBarComponent toolBar;
    private VerticalLinearLayout linearLayout;
    private BottomBar bottomBar;

    public MainContentView(Context context) {
        super(context);
        setOrientation(VERTICAL);
        addView(getToolBar());
        addView(getLinearLayout());
        addView(getBottomBar());
    }

    public ActionBarComponent getToolBar() {
        if(toolBar == null) {
            toolBar = new ActionBarComponent(getContext());
            toolBar.setExitButtonBackgroundDrawable(R.drawable.ic_menu);
        }
        return toolBar;
    }

    public VerticalLinearLayout getLinearLayout() {
        if(linearLayout == null) {
            linearLayout = new MainLinearLayout(getContext());
        }
        return linearLayout;
    }

    public BottomBar getBottomBar() {
        if(bottomBar == null) {
            bottomBar = new BottomBar(getContext());
        }
        return bottomBar;
    }
}