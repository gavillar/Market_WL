package com.example.whitelabel.extensions;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.whitelabel.navigation.NavigationController;

public class ActivityExtended extends AppCompatActivity {

    protected void startActivity(
            final Class<? extends AppCompatActivity> targetActivity
    ) {
        this.startActivity(
            NavigationController.getActivityIntent(
                this, targetActivity
            )
        );
    }

    protected void startActivity() {
        this.startActivity(NavigationController.getNextActivityIntent(this));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View view = getCurrentFocus();
            if (view instanceof EditText) {
                Rect outRect = new Rect();
                view.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    view.clearFocus();
                    InputMethodManager inputMethodManager = (
                            (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)
                    );
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
