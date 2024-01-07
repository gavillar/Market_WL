package com.example.market_wl.extensions;

import static android.content.Context.INPUT_METHOD_SERVICE;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class FragmentExtended extends Fragment {
    protected void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) (
                Objects
                        .requireNonNull(getActivity())
                        .getSystemService(INPUT_METHOD_SERVICE)
        );
        View focusedView = getActivity().getCurrentFocus();
        if (focusedView != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
        }
    }

    protected void replaceFragment(
            final @IdRes int containerViewId,
            final @NonNull Fragment fragment
    ) {
        Objects.requireNonNull(getActivity())
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId, fragment)
                .commitNow();
    }
}
