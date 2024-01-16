package com.example.whitelabel.layout.main.home;

import android.content.Context;
import android.widget.EditText;

import com.example.whitelabel.components.edit_text.SearchEditText;
import com.example.whitelabel.components.carousel.Carousel;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.layout.main.MainLinearLayout;

public class HomeLinearLayout extends MainLinearLayout {

    private EditText searchEditText;
    private Carousel carousel;
    private HomeLineRecyclerView homeLineRecyclerView;

    public HomeLinearLayout(Context context) {
        super(context);
        addView(getSearchEditText());
        addView(getCarousel());
        addView(getHomeLineRecyclerView());
    }

    public EditText getSearchEditText() {
        if(searchEditText == null) {
            searchEditText = new SearchEditText(getContext());
        }
        return searchEditText;
    }

    public Carousel getCarousel() {
        if(carousel == null) {
            carousel = new HomeCarousel(getContext());
        }
        return carousel;
    }

    public HomeLineRecyclerView getHomeLineRecyclerView() {
        if(homeLineRecyclerView == null) {
            homeLineRecyclerView = new HomeLineRecyclerView(getContext());
            homeLineRecyclerView.setPadding(0,30,0,30);
        }
        return homeLineRecyclerView;
    }
}