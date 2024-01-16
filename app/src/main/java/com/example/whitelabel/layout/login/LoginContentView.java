package com.example.whitelabel.layout.login;

import android.content.Context;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.example.whitelabel.R;
import com.example.whitelabel.components.button.BaseButton;

class LoginContentView extends LinearLayout {
    private LoginScrollView loginScrollView;
    private AppCompatButton enterButton;

    public LoginContentView(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        addView(getLoginScrollView());
        addView(getEnterButton());
    }

    public LoginScrollView getLoginScrollView() {
        if(loginScrollView == null) {
            loginScrollView = new LoginScrollView(getContext());
        }
        return loginScrollView;
    }

    public AppCompatButton getEnterButton() {
        if(enterButton == null) {
            enterButton = new BaseButton(getContext());
            enterButton.setText(R.string.entrar);
        }
        return enterButton;
    }

    public AppCompatButton getRegisterButton() {
        return getLoginScrollView()
            .getLoginButtonsLinearLayout()
            .getRegisterButton();
    }

    public AppCompatButton getForgotPasswordButton() {
        return getLoginScrollView()
            .getLoginButtonsLinearLayout()
            .getForgotPasswordButton();
    }
}