package com.example.whitelabel.layout.login;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.whitelabel.R;
import com.example.whitelabel.components.edit_text.EditTextComponent;
import com.example.whitelabel.components.scroll_view.LinearScrollView;
import com.example.whitelabel.components.text_view.TextViewComponent;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;

class LoginScrollView extends LinearScrollView {
    private EditText userEditText;
    private EditText passwordEditText;
    private LoginLogoLinearLayout logoLinearLayout;
    private TextView greetTextView;
    private LoginButtonsLinearLayout loginButtonsLinearLayout;

    public LoginScrollView(Context context) {
        super(context);
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                0
        );
        layoutParams.weight = 1;
        setLayoutParams(layoutParams);
        getLinearLayout().setPadding();
        addView(getLogoLinearLayout());
        addView(getGreetTextView());
        addView(getUserEditText());
        addView(getPasswordEditText());
        addView(getLoginButtonsLinearLayout());
    }

    private LoginLogoLinearLayout getLogoLinearLayout() {
        if(logoLinearLayout == null) {
            logoLinearLayout = new LoginLogoLinearLayout(getContext());
        }
        return logoLinearLayout;
    }

    public TextView getGreetTextView() {
        if(greetTextView == null) {
            greetTextView = new TextViewComponent(getContext());
            final LinearLayoutParams layoutParams = LinearLayoutParams.line();
            layoutParams.topMargin = 300;
            greetTextView.setLayoutParams(layoutParams);
            greetTextView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            greetTextView.setText(R.string.greet);
        }
        return greetTextView;
    }

    public EditText getUserEditText() {
        if(userEditText == null) {
            userEditText = new EditTextComponent(getContext());
            final LinearLayoutParams layoutParams = (
                    LinearLayoutParams.ofSize(userEditText)
            );
            layoutParams.topMargin = 100;
            userEditText.setLayoutParams(layoutParams);
            userEditText.setHint(R.string.telefone_email_ou_usuario);
        }
        return userEditText;
    }

    public EditText getPasswordEditText() {
        if(passwordEditText == null) {
            passwordEditText = new EditTextComponent(getContext());
            final LinearLayoutParams layoutParams = (
                LinearLayoutParams.ofSize(passwordEditText)
            );
            layoutParams.topMargin = 50;
            passwordEditText.setLayoutParams(layoutParams);
            passwordEditText.setHint(R.string.senha);
        }
        return passwordEditText;
    }

    public LoginButtonsLinearLayout getLoginButtonsLinearLayout() {
        if(loginButtonsLinearLayout == null) {
            loginButtonsLinearLayout = new LoginButtonsLinearLayout(getContext());
        }
        return loginButtonsLinearLayout;
    }
}