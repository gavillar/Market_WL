package com.example.whitelabel.layout.main.profile;

import com.example.whitelabel.R;
import com.example.whitelabel.layout.main.MainActivity;

public class ProfileActivity extends MainActivity {

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.profile);
    }
}