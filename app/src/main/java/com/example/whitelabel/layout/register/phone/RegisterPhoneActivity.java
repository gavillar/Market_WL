package com.example.whitelabel.layout.register.phone;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterPhoneActivity extends RegisterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getContentView().getScrollView().setLabelNdHint(
            R.string.qual_o_numero_do_seu_celular,
            R.string.celular
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.celular);
    }
}