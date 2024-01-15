package com.example.whitelabel.layout.register;

import android.os.Bundle;
import android.view.View;

import com.example.whitelabel.extensions.ActivityExtended;
import com.example.whitelabel.layout.login.LoginActivity;
import com.example.whitelabel.navigation.NavigationNode;

public abstract class RegisterActivity extends ActivityExtended implements NavigationNode {

    private RegisterContentView contentView;
    private final View.OnClickListener back = (
            view -> finish()
    );
    private final View.OnClickListener exit = (
            view -> startActivity(LoginActivity.class)
    );
    private final View.OnClickListener next = (
            view -> startActivity()
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        getContentView().getToolBar().setText(getName());
    }

    public RegisterContentView getContentView() {
        if(contentView == null) {
            contentView = new RegisterContentView(getBaseContext());
            contentView.getToolBar().setLeftButtonOnClickListener(back);
            contentView.getToolBar().setRightButtonOnClickListener(exit);
            contentView.getButton().setOnClickListener(next);
        }
        return contentView;
    }
}