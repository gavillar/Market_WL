package com.example.whitelabel.layout.register.address;

import android.os.Bundle;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.register.RegisterActivity;

public class RegisterAddressActivity extends RegisterActivity {

    private RegisterAddressContentView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        getContentView().getScrollView().setLabelNdHint(
                R.string.informe_os_dados_do_seu_endereco,
                R.string.cep,
                R.string.rua,
                R.string.numero,
                R.string.cidade
        );
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.endereco);
    }

    @Override
    public RegisterAddressContentView getContentView() {
        if(contentView == null) {
            contentView = new RegisterAddressContentView(getBaseContext());
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