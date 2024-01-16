package com.example.whitelabel.layout.main.home;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.line_recycler_view.LineRecyclerView;
import com.example.whitelabel.components.text_view.TextViewComponent;

import java.util.ArrayList;

public class HomeLineRecyclerView extends LineRecyclerView {

    private ArrayList<View> cells;

    public HomeLineRecyclerView(@NonNull Context context) {
        super(context);
    }

    @Override
    public ArrayList<View> getItems() {
        return getCells();
    }

    public ArrayList<View> getCells() {
        if(cells == null) {
            cells = new ArrayList<>();
            cells.add(newRecyclerImageView(""));
            cells.add(newRecyclerImageView(""));
            cells.add(newRecyclerImageView(""));
            cells.add(newRecyclerImageView(""));
            cells.add(newRecyclerImageView(""));
        }
        return cells;
    }

    public LinearLayout newRecyclerImageView(
            final String text
    ) {
        LinearLayout textView = new LinearLayout(getContext());
        textView.setBackgroundColor(Color.BLACK);
        final LinearLayoutParams layoutParams = (
                LinearLayoutParams.line(300)
        );
        layoutParams.setMargins(30,30,30,0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }
}