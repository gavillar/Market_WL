package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;
import android.view.Menu;

import androidx.drawerlayout.widget.DrawerLayout;

import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.layout.home.presenter.ui.home.HomeFragment;
import com.example.market_wl.extensions.AppCompatActivityExtended;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivityExtended {

    private ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(
        Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityHomeBinding().getRoot());
        getActivityHomeBindingRoot();
        getNavigationView();
        replaceFragment(
                savedInstanceState,
                getActivityHomeBinding().homeFrameLayout.getId(),
                HomeFragment.newInstance()
        );
    }

    private void getNavigationView() {
        final NavigationView homeNavigationView = (
                getActivityHomeBinding().homeNavigationView
        );
        final Menu menu = (
                homeNavigationView.getMenu()
        );
        final String[] items = new String[] {"Item 1", "Item 2"};
        for (int i = 0; i < items.length; i++) {
            final int I = i;
            menu.add(
                    Menu.NONE, Menu.FIRST + i, Menu.NONE, items[i]
            ).setOnMenuItemClickListener(
                    view -> {
                        System.out.println(I);
                        return false;
                    }
            );
        }
    }

    private void getActivityHomeBindingRoot() {
        final DrawerLayout drawerLayout = (
            getActivityHomeBinding().getRoot()
        );
        getActivityHomeBinding()
            .homeToolbarMenu.setOnClickListener(
                view -> drawerLayout.open()
            );
    }

    private ActivityHomeBinding getActivityHomeBinding() {
        if(activityHomeBinding == null) {
            activityHomeBinding = (
                ActivityHomeBinding.inflate(
                    getLayoutInflater()
                )
            );
        }
        return activityHomeBinding;
    }
}