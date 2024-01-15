package com.example.whitelabel.components;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.whitelabel.utils.EditTextUtils;

public class PairEditTexts extends LinearLayout {

    private EditTextComponent leftEditText;
    private EditTextComponent rightEditText;

    public PairEditTexts(Context context) {
        super(context);
        addView(getLeftEditText());
        addView(getRightEditText());
        setPairWeight(.5f,.5f);
    }

    public EditTextComponent getLeftEditText() {
        if(leftEditText == null) {
            leftEditText = new EditTextComponent(getContext());
        }
        return leftEditText;
    }

    public EditTextComponent getRightEditText() {
        if(rightEditText == null) {
            rightEditText = new EditTextComponent(getContext());
        }
        return rightEditText;
    }

    public void setPairHint(
        final int left,
        final int right
    ) {
        getLeftEditText().setHint(left);
        getRightEditText().setHint(right);
    }

    public void setPairWeight(
            final float left,
            final float right
    ) {
        final LinearLayout.LayoutParams leftLayoutParams = (
                new LinearLayout.LayoutParams(
                        0,
                        EditTextUtils.getDefaultHeight()
                )
        );
        leftLayoutParams.weight = left;
        getLeftEditText().setLayoutParams(leftLayoutParams);
        final LinearLayout.LayoutParams rightLayoutParams = (
                new LinearLayout.LayoutParams(
                        0,
                        EditTextUtils.getDefaultHeight()
                )
        );
        rightLayoutParams.weight = right;
        rightLayoutParams.setMargins(50,0,0,0);
        getRightEditText().setLayoutParams(rightLayoutParams);
    }
}