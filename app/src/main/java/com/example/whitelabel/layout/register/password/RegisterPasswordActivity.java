package com.example.whitelabel.layout.register.password;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterPasswordActivity extends RegisterActivity {

    private RegisterPasswordContentView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        getContentView().getScrollView().setLabelNdHint(
                R.string.escolha_uma_senha,
                R.string.senha,
                R.string.confirme_a_senha,
                R.string.senha
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.senha);
    }

    @Override
    public RegisterPasswordContentView getContentView() {
        if(contentView == null) {
            contentView = new RegisterPasswordContentView(getBaseContext());
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