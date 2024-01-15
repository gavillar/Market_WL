package com.example.whitelabel.layout.main.cart;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.main.MainActivity;

public class CartActivity extends MainActivity {

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.cart);
    }
}