package com.example.whitelabel.components.line_recycler_view;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public abstract class LineRecyclerView extends RecyclerView {

    private LineRecyclerViewAdapter adapter;

    public LineRecyclerView(@NonNull Context context) {
        super(context);
        setAdapter(getAdapter());
        final GridLayoutManager layoutManager = (
                new GridLayoutManager(getContext(), 1)
        );
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        setLayoutManager(layoutManager);
        setHasFixedSize(true);
    }

    public abstract ArrayList<View> getItems();

    @Nullable
    @Override
    public LineRecyclerViewAdapter getAdapter() {
        if(adapter == null) {
            adapter = new LineRecyclerViewAdapter(getContext(), getItems());
        }
        return adapter;
    }

    public void smoothScrollToNextPosition() {
        final GridLayoutManager layoutManager = (
                (GridLayoutManager) getLayoutManager()
        );
        assert layoutManager != null;
        final int id = layoutManager.findFirstVisibleItemPosition();
        if(
                (id + 1) == Objects.requireNonNull(getAdapter()).getItemCount()
        ) {
            smoothScrollToPosition(0);
        } else {
            smoothScrollToPosition(id + 1);
        }
    }
}