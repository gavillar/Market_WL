package com.example.whitelabel.layout.register.password;

import android.content.Context;
import android.view.ViewGroup;

import com.example.whitelabel.components.EditTextComponent;
import com.example.whitelabel.components.TextViewComponent;
import com.example.whitelabel.layout.register.RegisterScrollView;

public class RegisterPasswordScrollView extends RegisterScrollView {
    private TextViewComponent passwordConfirmationTextView;
    private EditTextComponent passwordConfirmationEditText;

    public RegisterPasswordScrollView(Context context) {
        super(context);
        addView(getPasswordConfirmationTextView());
        addView(getPasswordConfirmationEditText());
    }

    public TextViewComponent getPasswordConfirmationTextView() {
        if(passwordConfirmationTextView == null) {
            passwordConfirmationTextView = new TextViewComponent(getContext());
            LayoutParams layoutParams = new LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(0,50,0,0);
            passwordConfirmationTextView.setLayoutParams(layoutParams);
        }
        return passwordConfirmationTextView;
    }

    public EditTextComponent getPasswordConfirmationEditText() {
        if(passwordConfirmationEditText == null) {
            passwordConfirmationEditText = new EditTextComponent(getContext());
        }
        return passwordConfirmationEditText;
    }

    public void setLabelNdHint(
            int passwordLabel,
            int passwordHint,
            int passwordConfirmationLabel,
            int passwordConfirmationHint
    ) {
        super.setLabelNdHint(passwordLabel, passwordHint);
        getPasswordConfirmationTextView().setText(passwordConfirmationLabel);
        getPasswordConfirmationEditText().setHint(passwordConfirmationHint);
    }
}