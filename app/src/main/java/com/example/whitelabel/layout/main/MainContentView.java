package com.example.whitelabel.layout.main;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;

import com.example.whitelabel.R;
import com.example.whitelabel.components.BottomBar;
import com.example.whitelabel.components.ScrollViewComponent;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;

class MainContentView extends LinearLayout {

    private ActionBarComponent toolBar;
    private ScrollViewComponent scrollView;
    private BottomBar bottomBar;

    public MainContentView(Context context) {
        super(context);
        setOrientation(VERTICAL);
        addView(getToolBar());
        addView(getScrollView());
        addView(getBottomBar());
    }

    public ActionBarComponent getToolBar() {
        if(toolBar == null) {
            toolBar = new ActionBarComponent(getContext());
            toolBar.setExitButtonBackgroundDrawable(R.drawable.ic_menu);
        }
        return toolBar;
    }

    public ScrollViewComponent getScrollView() {
        if(scrollView == null) {
            scrollView = new ScrollViewComponent(getContext());
            final LinearLayoutParams layoutParams = LinearLayoutParams.line();
            layoutParams.weight = 1;
            scrollView.setLayoutParams(layoutParams);
            scrollView.setBackgroundColor(Color.BLUE);
        }
        return scrollView;
    }

    public BottomBar getBottomBar() {
        if(bottomBar == null) {
            bottomBar = new BottomBar(getContext());
        }
        return bottomBar;
    }
}