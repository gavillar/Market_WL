package com.example.whitelabel.layout.register.password;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.BaseButton;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;
import com.example.whitelabel.layout.register.RegisterContentView;

public class RegisterPasswordContentView extends RegisterContentView {

    private RegisterPasswordScrollView scrollView;

    public RegisterPasswordContentView(Context context) {
        super(context);
    }

    @Override
    public RegisterPasswordScrollView getScrollView() {
        if(scrollView == null) {
            scrollView = new RegisterPasswordScrollView(getContext());
        }
        return scrollView;
    }
}