package com.example.whitelabel.layout.main.home;

import android.os.Handler;

import com.example.whitelabel.R;
import com.example.whitelabel.components.carousel.Carousel;
import com.example.whitelabel.layout.main.MainActivity;

public class HomeActivity extends MainActivity {

    private HomeContentView contentView;
    private Runnable runnable;
    private final Handler handler = new Handler();

    @Override
    public CharSequence getName() {
        return getResources().getText(R.string.home);
    }

    @Override
    protected HomeContentView getContentView() {
        if(contentView == null) {
            contentView = new HomeContentView(getBaseContext());
        }
        return contentView;
    }

    @Override
    public void onResume() {
        super.onResume();
        final int delay = 1000;
        runnable = () -> {
            final Carousel recyclerView = (
                getContentView()
                    .getLinearLayout()
                    .getCarousel()
            );
            recyclerView.smoothScrollToNextPosition();
            handler.postDelayed(runnable, delay);
        };
        handler.postDelayed(runnable, delay);
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }
}