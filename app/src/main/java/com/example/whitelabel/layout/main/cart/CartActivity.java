package com.example.whitelabel.layout.main.cart;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.main.MainActivity;
import com.example.whitelabel.layout.main.MainContentView;

public class CartActivity extends MainActivity {

    private CartContentView contentView;

    @Override
    protected CartContentView getContentView() {
        if(contentView == null) {
            contentView = new CartContentView(getBaseContext());
        }
        return contentView;
    }

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.your_basket);
    }
}