package com.example.whitelabel.layout.register.email;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterEmailActivity extends RegisterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getContentView().getScrollView().setLabelNdHint(
            R.string.what_s_your_email,
            R.string.email
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.email);
    }
}