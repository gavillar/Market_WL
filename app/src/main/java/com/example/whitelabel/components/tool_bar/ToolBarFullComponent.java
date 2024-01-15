package com.example.whitelabel.components.tool_bar;

import android.content.Context;
import android.widget.EditText;

import com.example.whitelabel.R;
import com.example.whitelabel.components.SearchEditText;
import com.example.whitelabel.components.IconButton;
import com.example.whitelabel.utils.LayoutParamsUtils;

public class ToolBarFullComponent extends ToolBarComponent {
    private EditText editText;
    private IconButton configurationsButton;
    private IconButton cartButton;
    private IconButton logoButton;

    public ToolBarFullComponent(Context context) {
        super(context);
        addView(getLogoButton());
        addView(getEditText());
        addView(getConfigurationsButton());
        addView(getCartButton());
    }

    public IconButton getLogoButton() {
        if(logoButton == null) {
            logoButton = new IconButton(getContext());
            LayoutParams layoutParams = (
                    new LayoutParams(
                        LayoutParamsUtils.getActionBarHeight(getContext()),
                        LayoutParamsUtils.getActionBarHeight(getContext())
                    )
            );
            layoutParams.setMargins(
                    0,0,50,0
            );
            logoButton.setLayoutParams(layoutParams);
            logoButton.setBackgroundDrawable(R.drawable.logo);
        }
        return logoButton;
    }

    public EditText getEditText() {
        if(editText == null) {
            editText = new SearchEditText(getContext());
            LayoutParams layoutParams = new LayoutParams(
                editText.getLayoutParams().width,
                Double.valueOf(LayoutParamsUtils.getActionBarHeight(getContext())*0.75).intValue()
            );
            layoutParams.weight = 1;
            editText.setLayoutParams(layoutParams);
        }
        return editText;
    }

    public IconButton getConfigurationsButton() {
        if(configurationsButton == null) {
            configurationsButton = new IconButton(getContext());
            LayoutParams layoutParams = new LayoutParams(
                    getResources().getDisplayMetrics().heightPixels / 20,
                    getResources().getDisplayMetrics().heightPixels / 20
            );
            layoutParams.setMargins(
                    50,0,0,0
            );
            configurationsButton.setLayoutParams(layoutParams);
            configurationsButton.setBackgroundDrawable(R.drawable.ic_menu);
        }
        return configurationsButton;
    }

    public IconButton getCartButton() {
        if(cartButton == null) {
            cartButton = new IconButton(getContext());
            LayoutParams layoutParams = new LayoutParams(
                    getResources().getDisplayMetrics().heightPixels / 20,
                    getResources().getDisplayMetrics().heightPixels / 20
            );
            layoutParams.setMargins(
                    50,0,0,0
            );
            cartButton.setLayoutParams(layoutParams);
            cartButton.setBackgroundDrawable(R.drawable.ic_cart);
        }
        return cartButton;
    }
}