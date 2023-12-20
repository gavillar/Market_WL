package com.example.market_wl.layout.home.presenter.ui.home;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public HomeViewHolder(TextView textView) {
        super(textView);
        setTextView(textView);
    }

    public void setTextView(final TextView textView) {
        textView.setBackgroundColor(Color.GREEN);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(20);
        textView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        this.textView = textView;
    }
}