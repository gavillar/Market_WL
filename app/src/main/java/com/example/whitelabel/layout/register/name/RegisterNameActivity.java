package com.example.whitelabel.layout.register.name;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterNameActivity extends RegisterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getContentView().getScrollView().setLabelNdHint(
            R.string.qual_o_seu_nome,
            R.string.nome
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.nome);
    }
}