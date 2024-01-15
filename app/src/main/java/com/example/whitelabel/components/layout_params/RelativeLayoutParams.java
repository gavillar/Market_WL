package com.example.whitelabel.components.layout_params;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class RelativeLayoutParams extends RelativeLayout.LayoutParams {

    public static RelativeLayoutParams line() {
        return new RelativeLayoutParams(MATCH_PARENT, WRAP_CONTENT);
    }

    public static RelativeLayoutParams line(final int height) {
        return new RelativeLayoutParams(MATCH_PARENT, height);
    }

    public static RelativeLayoutParams column() {
        return new RelativeLayoutParams(WRAP_CONTENT, MATCH_PARENT);
    }

    public static RelativeLayoutParams column(final int width) {
        return new RelativeLayoutParams(width, MATCH_PARENT);
    }

    public static RelativeLayoutParams fill() {
        return new RelativeLayoutParams(MATCH_PARENT, MATCH_PARENT);
    }

    public static RelativeLayoutParams wrap() {
        return new RelativeLayoutParams(WRAP_CONTENT, WRAP_CONTENT);
    }

    public static RelativeLayoutParams ofSize(View view) {
        return new RelativeLayoutParams(
                view.getLayoutParams().width,
                view.getLayoutParams().height
        );
    }

    public static RelativeLayoutParams ofSize(int width, int height) {
        return new RelativeLayoutParams(width, height);
    }

    private RelativeLayoutParams(int width, int height) {
        super(width, height);
    }

    public void setToLeftOf(final View view) {
        if(view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        addRule(RelativeLayout.LEFT_OF, view.getId());
        addRule(RelativeLayout.START_OF, view.getId());
    }

    public void setToRightOf(final View view) {
        if(view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        addRule(RelativeLayout.RIGHT_OF, view.getId());
        addRule(RelativeLayout.END_OF, view.getId());
    }

    public void setAbove(final View view) {
        if(view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        addRule(RelativeLayout.ABOVE, view.getId());
    }

    public void setBelow(final View view) {
        if(view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        addRule(RelativeLayout.BELOW, view.getId());
    }

    public void setCenterHorizontal() {
        addRule(RelativeLayout.CENTER_HORIZONTAL);
    }

    public void setCenterVertical() {
        addRule(RelativeLayout.CENTER_VERTICAL);
    }
}