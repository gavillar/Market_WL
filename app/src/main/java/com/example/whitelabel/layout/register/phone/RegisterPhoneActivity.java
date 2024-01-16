package com.example.whitelabel.layout.register.phone;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterPhoneActivity extends RegisterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getContentView().getScrollView().setLabelNdHint(
            R.string.what_s_your_phone_number,
            R.string.phone
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.phone);
    }
}