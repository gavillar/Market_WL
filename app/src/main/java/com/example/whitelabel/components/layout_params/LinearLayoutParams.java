package com.example.whitelabel.components.layout_params;

import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutParams extends LinearLayout.LayoutParams {

    public static LinearLayoutParams line() {
        return new LinearLayoutParams(MATCH_PARENT, WRAP_CONTENT);
    }

    public static LinearLayoutParams line(final int height) {
        return new LinearLayoutParams(MATCH_PARENT, height);
    }

    public static LinearLayoutParams column() {
        return new LinearLayoutParams(WRAP_CONTENT, MATCH_PARENT);
    }

    public static LinearLayoutParams fill() {
        return new LinearLayoutParams(MATCH_PARENT, MATCH_PARENT);
    }

    public static LinearLayoutParams wrap() {
        return new LinearLayoutParams(WRAP_CONTENT, WRAP_CONTENT);
    }

    public static LinearLayoutParams ofSize(final View view) {
        return new LinearLayoutParams(
                view.getLayoutParams().width,
                view.getLayoutParams().height
        );
    }

    public static LinearLayoutParams ofSize(int width, int height) {
        return new LinearLayoutParams(width, height);
    }

    private LinearLayoutParams(int width, int height) {
        super(width, height);
    }
}