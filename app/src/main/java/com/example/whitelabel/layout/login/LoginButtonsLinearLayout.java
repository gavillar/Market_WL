package com.example.whitelabel.layout.login;

import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.example.whitelabel.R;
import com.example.whitelabel.components.button.CleanButton;

class LoginButtonsLinearLayout extends LinearLayout {
    
    private CleanButton forgotPasswordButton;
    private CleanButton registerButton;

    public LoginButtonsLinearLayout(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.END);
        addView(getForgotPasswordButton());
        addView(getRegisterButton());
    }

    public CleanButton getRegisterButton() {
        if(registerButton == null) {
            registerButton = new CleanButton(getContext());
            registerButton.setText(R.string.create_account);
        }
        return registerButton;
    }

    public CleanButton getForgotPasswordButton() {
        if(forgotPasswordButton == null) {
            forgotPasswordButton = new CleanButton(getContext());
            forgotPasswordButton.setText(R.string.forgot_password);
        }
        return forgotPasswordButton;
    }
}