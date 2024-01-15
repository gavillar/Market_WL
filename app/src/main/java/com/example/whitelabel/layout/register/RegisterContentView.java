package com.example.whitelabel.layout.register;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.BaseButton;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;

public class RegisterContentView extends LinearLayout {

    private ActionBarComponent toolBar;
    private RegisterScrollView scrollView;
    private BaseButton button;

    public RegisterContentView(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        addView(getToolBar());
        addView(getScrollView());
        addView(getButton());
    }

    public ActionBarComponent getToolBar() {
        if(toolBar == null) {
            toolBar = new ActionBarComponent(getContext());
        }
        return toolBar;
    }

    public RegisterScrollView getScrollView() {
        if(scrollView == null) {
            scrollView = new RegisterScrollView(getContext());
        }
        return scrollView;
    }

    public BaseButton getButton() {
        if(button == null) {
            button = new BaseButton(getContext());
        }
        return button;
    }
}