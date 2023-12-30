package com.example.market_wl.layout.home.presenter.carousel;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market_wl.R;
import com.makeramen.roundedimageview.RoundedImageView;

class SlideViewHolder extends RecyclerView.ViewHolder {

    private RoundedImageView imageView;

    public SlideViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.slide_carousel_container);
    }

    void setImage(SlideItem slideItem) {

        imageView.setImageResource(slideItem.getImage());


    }
}


