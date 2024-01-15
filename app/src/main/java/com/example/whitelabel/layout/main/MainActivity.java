package com.example.whitelabel.layout.main;

import android.os.Bundle;

import com.example.whitelabel.components.BottomBarImageView;
import com.example.whitelabel.extensions.ActivityExtended;
import com.example.whitelabel.navigation.NavigationNode;

public abstract class MainActivity extends ActivityExtended implements NavigationNode {

    private MainContentView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
    }

    private MainContentView getContentView() {
        if(contentView == null) {
            contentView = new MainContentView(getBaseContext());
            contentView.getToolBar().setLeftButtonOnClickListener(
                view -> finish()
            );
            contentView.getToolBar().setText(getName());
            contentView.getBottomBar().setOnClickListener(
                view -> {
                    final BottomBarImageView imageView = (BottomBarImageView) view;
                    startActivity(imageView.getTargetView());
                }
            );
        }
        return contentView;
    }
}