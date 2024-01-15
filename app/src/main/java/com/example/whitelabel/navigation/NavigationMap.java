package com.example.whitelabel.navigation;

import android.app.Activity;

import com.example.whitelabel.layout.main.MainActivity;
import com.example.whitelabel.layout.login.LoginActivity;
import com.example.whitelabel.layout.main.home.HomeActivity;
import com.example.whitelabel.layout.register.address.RegisterAddressActivity;
import com.example.whitelabel.layout.register.cpf.RegisterCpfActivity;
import com.example.whitelabel.layout.register.email.RegisterEmailActivity;
import com.example.whitelabel.layout.register.name.RegisterNameActivity;
import com.example.whitelabel.layout.register.password.RegisterPasswordActivity;
import com.example.whitelabel.layout.register.phone.RegisterPhoneActivity;

import java.util.HashMap;

class NavigationMap extends HashMap<Class<? extends Navigable>, Class<? extends Navigable>> {

    NavigationMap() {
        put(LoginActivity.class, HomeActivity.class);
        put(RegisterNameActivity.class, RegisterEmailActivity.class);
        put(RegisterEmailActivity.class, RegisterCpfActivity.class);
        put(RegisterCpfActivity.class, RegisterPhoneActivity.class);
        put(RegisterPhoneActivity.class, RegisterPasswordActivity.class);
        put(RegisterPasswordActivity.class, RegisterAddressActivity.class);
        put(RegisterAddressActivity.class, LoginActivity.class);
    }
}