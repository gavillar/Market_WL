package com.example.whitelabel.layout.login;

import android.os.Bundle;
import android.view.View.OnClickListener;

import com.example.whitelabel.extensions.ActivityExtended;
import com.example.whitelabel.layout.forgot_password.ForgotPasswordActivity;
import com.example.whitelabel.layout.register.name.RegisterNameActivity;

public class LoginActivity extends ActivityExtended {

    private LoginContentView contentView;
    private final OnClickListener enter = (
            view -> startActivity()
    );
    private final OnClickListener register = (
            view -> startActivity(RegisterNameActivity.class)
    );
    private final OnClickListener forgotPassword = (
            view -> startActivity(ForgotPasswordActivity.class)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
    }

    private LoginContentView getContentView() {
        if(contentView == null) {
            contentView = new LoginContentView(getBaseContext());
            contentView
                .getEnterButton()
                .setOnClickListener(enter);
            contentView
                .getForgotPasswordButton()
                .setOnClickListener(forgotPassword);
            contentView
                .getRegisterButton()
                .setOnClickListener(register);
        }
        return contentView;
    }
}