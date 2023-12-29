package com.example.market_wl.layout.home.presenter;

import android.os.Bundle;
import android.view.View;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.extensions.AppCompatActivityExtended;
import com.example.market_wl.layout.home.presenter.carousel.SlideItem;
import com.example.market_wl.layout.home.presenter.carousel.SliderAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivityExtended {

    private ActivityHomeBinding activityHomeBinding;

    private ViewPager2 viewPager2;


    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityHomeBinding().getRoot());
        getHomeFragmentContainerView();
        getActivityHomeBindingRoot();
        configCarousel();
    }

    void configCarousel() {

        viewPager2 = findViewById(R.id.view_pager_carousel);

        List<SlideItem> slideItem = new ArrayList<>();
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));

        viewPager2.setAdapter(new SliderAdapter(slideItem, viewPager2));

    }


    private void getHomeFragmentContainerView() {
        final NavHostFragment navHostFragment = (
            (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(
                    getActivityHomeBinding()
                    .homeFragmentContainerView
                    .getId()
                )
        );
        assert navHostFragment != null;
        final NavController navController = (
            navHostFragment
                .getNavController()
        );
        NavigationUI.setupWithNavController(activityHomeBinding.bottomNavigation, navController);
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