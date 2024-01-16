package com.example.whitelabel.layout.main;

import android.os.Bundle;

import com.example.whitelabel.components.bottom_bar.BottomBarImageView;
import com.example.whitelabel.components.tool_bar.ActionBarComponent;
import com.example.whitelabel.extensions.ActivityExtended;

public abstract class MainActivity extends ActivityExtended {

    private MainContentView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        setToolBar();
        setBottomBar();
    }

    protected MainContentView getContentView() {
        if(contentView == null) {
            contentView = new MainContentView(getBaseContext());
        }
        return contentView;
    }

    protected void setToolBar() {
        final ActionBarComponent toolBar = getContentView().getToolBar();
        toolBar.setLeftButtonOnClickListener(FINISH_ACTIVITY);
        toolBar.setText(getName());
    }

    protected void setBottomBar() {
        getContentView()
            .getBottomBar()
            .setOnClickListener(
                view -> {
                    final BottomBarImageView imageView = (BottomBarImageView) view;
                    startActivity(imageView.getTargetView());
                }
            );
    }
}