package com.example.whitelabel.layout.register;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.whitelabel.components.edit_text.EditTextComponent;
import com.example.whitelabel.components.scroll_view.LinearScrollView;
import com.example.whitelabel.components.text_view.TextViewComponent;

public class RegisterScrollView extends LinearScrollView {

    private TextViewComponent textView;
    private EditTextComponent editText;

    public RegisterScrollView(Context context) {
        super(context);
        getLinearLayout().setPadding(75, 150, 75, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                0
        );
        layoutParams.weight = 1;
        setLayoutParams(layoutParams);
        addView(getTextView());
        addView(getEditText());
    }

    public EditTextComponent getEditText() {
        if(editText == null) {
            editText = new EditTextComponent(getContext());
        }
        return editText;
    }

    public TextViewComponent getTextView() {
        if(textView == null) {
            textView = new TextViewComponent(getContext());
        }
        return textView;
    }

    public void setLabelNdHint(
            final int label,
            final int hint
    ) {
        getTextView().setText(label);
        getEditText().setHint(hint);
    }
}