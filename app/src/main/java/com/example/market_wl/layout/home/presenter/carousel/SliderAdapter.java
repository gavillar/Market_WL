package com.example.market_wl.layout.home.presenter.carousel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.market_wl.R;

import java.util.List;


public class SliderAdapter extends RecyclerView.Adapter<SlideViewHolder> {

    private List<SlideItem> slideItems;
    private ViewPager2 viewPager2;

    public SliderAdapter(List<SlideItem> slideItems, ViewPager2 viewPager2) {
        this.slideItems = slideItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SlideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SlideViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(

                        R.layout.item_carousel_slide_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SlideViewHolder holder, int position) {

        holder.setImage(slideItems.get(position));

        if(position == slideItems.size() - 2) {
            viewPager2.post(runnable);
        }
    }

    @Override
    public int getItemCount() {
        return slideItems.size();
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            slideItems.addAll(slideItems);
            notifyDataSetChanged();

        }
    };
}
