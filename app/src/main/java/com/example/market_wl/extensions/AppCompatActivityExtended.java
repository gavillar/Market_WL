package com.example.market_wl.extensions;

import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class AppCompatActivityExtended extends AppCompatActivity {
    protected void replaceFragment(
            final Bundle savedInstanceState,
            final @IdRes int containerViewId,
            final @NonNull Fragment fragment
    ) {
        if (savedInstanceState != null) return;
        getSupportFragmentManager()
            .beginTransaction()
            .replace(containerViewId, fragment)
            .commitNow();
    }
}
