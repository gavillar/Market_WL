package com.example.whitelabel.layout.forgot_password;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.extensions.ActivityExtended;

public class ForgotPasswordActivity extends ActivityExtended {

    private ForgotPasswordContentView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        getContentView().getScrollView().setLabelNdHint(
                R.string.what_s_your_email,
                R.string.email
        );
    }

    public ForgotPasswordContentView getContentView() {
        if(contentView == null) {
            contentView = new ForgotPasswordContentView(getBaseContext());
            contentView.getToolBar().setLeftButtonOnClickListener(view -> finish());
            contentView.getButton().setOnClickListener(
                view -> {
                    startActivity();
                }
            );
        }
        return contentView;
    }
}