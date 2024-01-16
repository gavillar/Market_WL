package com.example.whitelabel.layout.register.cpf;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterCpfActivity extends RegisterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getContentView().getScrollView().setLabelNdHint(
            R.string.what_s_your_cpf,
            R.string.cpf
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.cpf);
    }
}