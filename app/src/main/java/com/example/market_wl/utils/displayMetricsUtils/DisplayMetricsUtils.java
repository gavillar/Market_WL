package com.example.market_wl.utils.displayMetricsUtils;

import android.view.View;

public class DisplayMetricsUtils {

    private View displayView;

    public DisplayMetricsUtils(View displayView) {
        this.displayView = displayView;
    }

    public int convertToDp(final int value) {
        final float scale = (
                displayView
                        .getResources()
                        .getDisplayMetrics()
                        .density
        );
        return (int) (value * scale + 0.5f);
    }
}
