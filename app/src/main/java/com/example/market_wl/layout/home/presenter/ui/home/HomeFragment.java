package com.example.market_wl.layout.home.presenter.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.databinding.FragmentHomeBinding;
import com.example.market_wl.layout.home.presenter.carousel.SlideItem;
import com.example.market_wl.layout.home.presenter.carousel.SliderAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    private FragmentHomeBinding fragmentHomeBinding;


    private ViewPager2 viewPager2;

    private Handler sliderHandler = new Handler();


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {

        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Ofertas");
        dataList.add("Os mais vendidos");



        RecyclerView recyclerView = getFragmentHomeRecyclerView();
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        HomeAdapter homeAdapter = new HomeAdapter(getContext(), dataList);
        recyclerView.setAdapter(homeAdapter);

        return getFragmentHomeBinding().getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configCarousel();
    }

    @Override
    public void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(runnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        sliderHandler.postDelayed(runnable, 3000);

    }

    private FragmentHomeBinding getFragmentHomeBinding() {
        if(fragmentHomeBinding == null) {
            fragmentHomeBinding = (
                FragmentHomeBinding.inflate(
                    getLayoutInflater()
                )
            );
        }
        return fragmentHomeBinding;
    }

    private RecyclerView getFragmentHomeRecyclerView() {
        return getFragmentHomeBinding().fragmentHomeRecyclerView;
    }


    void configCarousel() {


        viewPager2 = fragmentHomeBinding.getRoot().findViewById(R.id.view_pager_carousel);

        List<SlideItem> slideItem = new ArrayList<>();
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));
        slideItem.add(new SlideItem(R.drawable.image_offer));

        viewPager2.setAdapter(new SliderAdapter(slideItem, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(5);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(30));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1- Math.abs(position);

                page.setScaleX(0.85f + r*0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                sliderHandler.removeCallbacks(runnable);
                sliderHandler.postDelayed(runnable, 3000);
            }
        });
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };
}