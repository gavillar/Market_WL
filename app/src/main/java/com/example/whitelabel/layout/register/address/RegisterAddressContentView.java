package com.example.whitelabel.layout.register.address;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.components.BaseButton;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;
import com.example.whitelabel.layout.register.RegisterContentView;

public class RegisterAddressContentView extends RegisterContentView {

    private RegisterAddressScrollView scrollView;

    public RegisterAddressContentView(Context context) {
        super(context);
    }

    @Override
    public RegisterAddressScrollView getScrollView() {
        if(scrollView == null) {
            scrollView = new RegisterAddressScrollView(getContext());
        }
        return scrollView;
    }
}