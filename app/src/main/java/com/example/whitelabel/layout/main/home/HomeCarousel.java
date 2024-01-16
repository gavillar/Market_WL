package com.example.whitelabel.layout.main.home;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;

import com.example.whitelabel.R;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.carousel.Carousel;
import com.example.whitelabel.extensions.ImageViewExtended;

import java.util.ArrayList;

public class HomeCarousel extends Carousel {

    private ArrayList<View> cells;

    public HomeCarousel(@NonNull Context context) {
        super(context);
    }

    @Override
    public ArrayList<View> getItems() {
        return getCells();
    }

    public ArrayList<View> getCells() {
        if(cells == null) {
            cells = new ArrayList<>();
            cells.add(newRecyclerImageView());
            cells.add(newRecyclerImageView());
        }
        return cells;
    }

    public ImageViewExtended newRecyclerImageView() {
        ImageViewExtended imageView = new ImageViewExtended(getContext()) {};
        imageView.setImageDrawable(R.drawable.image_offer);
        imageView.setLayoutParams(LinearLayoutParams.line(720));
        return imageView;
    }
}