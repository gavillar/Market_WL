package com.example.whitelabel.layout.main.home;

import android.content.Context;

import com.example.whitelabel.layout.main.MainContentView;

public class HomeContentView extends MainContentView {

    private HomeLinearLayout scrollView;

    public HomeContentView(Context context) {
        super(context);
    }

    @Override
    public HomeLinearLayout getLinearLayout() {
        if(scrollView == null) {
            scrollView = new HomeLinearLayout(getContext());
        }
        return scrollView;
    }
}