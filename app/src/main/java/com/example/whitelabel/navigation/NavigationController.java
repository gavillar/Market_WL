package com.example.whitelabel.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public abstract class NavigationController {
    private static final NavigationMap navigationMap = newNavigationMap();

    private static NavigationMap newNavigationMap() {
        return new NavigationMap();
    }

    public static Intent getNextActivityIntent(
            Activity activity
    ) {
        return getActivityIntent(
                activity,
                navigationMap.get(activity.getClass())
        );
    }

    public static Intent getActivityIntent(
            Context context,
            Class<?> target
    ) {
        final Intent intent = new Intent(context, target);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        return intent;
    }
}