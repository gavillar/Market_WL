package com.example.whitelabel.layout.main.home;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.main.MainActivity;

public class HomeActivity extends MainActivity {

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.home);
    }
}