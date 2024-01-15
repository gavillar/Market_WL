package com.example.whitelabel.components.tool_bar;

import android.content.Context;
import android.view.Gravity;

import com.example.whitelabel.R;
import com.example.whitelabel.components.IconButton;
import com.example.whitelabel.components.TextViewComponent;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.utils.LayoutParamsUtils;

public class ActionBarComponent extends ToolBarComponent {

    private IconButton leftButton;
    private TextViewComponent textViewComponent;
    private IconButton rightButton;

    public ActionBarComponent(Context context) {
        super(context);
        addView(getLeftButton());
        addView(getTextViewComponent());
        addView(getRightButton());
    }

    private IconButton getLeftButton() {
        if(leftButton == null) {
            leftButton = new IconButton(getContext());
            final LinearLayoutParams layoutParams = (
                LinearLayoutParams.ofSize(
                    LayoutParamsUtils.getActionBarHeight(getContext()),
                    LayoutParamsUtils.getActionBarHeight(getContext())
                )
            );
            layoutParams.setMarginStart(40);
            leftButton.setLayoutParams(layoutParams);
            leftButton.setBackgroundDrawable(R.drawable.ic_arrow_back_ios);
        }
        return leftButton;
    }

    private TextViewComponent getTextViewComponent() {
        if(textViewComponent == null) {
            textViewComponent = new TextViewComponent(getContext());
            final LinearLayoutParams layoutParams = LinearLayoutParams.wrap();
            layoutParams.weight = 1;
            textViewComponent.setLayoutParams(layoutParams);
            textViewComponent.setGravity(Gravity.CENTER);
        }
        return textViewComponent;
    }

    private IconButton getRightButton() {
        if(rightButton == null) {
            rightButton = new IconButton(getContext());
            final LinearLayoutParams layoutParams = (
                    LinearLayoutParams.ofSize(
                            LayoutParamsUtils.getActionBarHeight(getContext()),
                            LayoutParamsUtils.getActionBarHeight(getContext())
                    )
            );
            layoutParams.setMarginEnd(40);
            rightButton.setLayoutParams(layoutParams);
            rightButton.setBackgroundDrawable(R.drawable.ic_exit);
        }
        return rightButton;
    }

    public void setExitButtonBackgroundDrawable(final int id) {
        getRightButton().setBackgroundDrawable(id);
    }

    public void setText(final CharSequence text) {
        getTextViewComponent().setText(text);
    }

    public void setLeftButtonOnClickListener(final OnClickListener onClickListener) {
        getLeftButton().setOnClickListener(onClickListener);
    }

    public void setRightButtonOnClickListener(final OnClickListener onClickListener) {
        getRightButton().setOnClickListener(onClickListener);
    }
}