package com.example.whitelabel.layout.forgot_password;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.button.BaseButton;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;

public class ForgotPasswordContentView extends LinearLayout {

    private ActionBarComponent toolBar;
    private ForgotPasswordScrollView scrollView;
    private BaseButton button;

    public ForgotPasswordContentView(Context context) {
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

    public ForgotPasswordScrollView getScrollView() {
        if(scrollView == null) {
            scrollView = new ForgotPasswordScrollView(getContext());
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