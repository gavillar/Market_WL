package com.example.whitelabel.components;

import android.app.Activity;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.example.whitelabel.extensions.ImageViewExtended;

public class BottomBarImageView extends ImageViewExtended {

    private Class<? extends AppCompatActivity> targetView;

    public BottomBarImageView(Context context) {
        super(context);
    }

    public void setTargetView(Class<? extends AppCompatActivity> targetView) {
        this.targetView = targetView;
    }

    public Class<? extends AppCompatActivity> getTargetView() {
        return targetView;
    }
}