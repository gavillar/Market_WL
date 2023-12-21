package com.example.market_wl.layout.home.presenter.ui.home;

import android.graphics.Color;
import android.os.Bundle;
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

import com.example.market_wl.R;
import com.example.market_wl.databinding.ActivityHomeBinding;
import com.example.market_wl.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    private FragmentHomeBinding fragmentHomeBinding;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Item 1");
        dataList.add("Item 2");
        dataList.add("Item 3");
        dataList.add("Item 4");

        RecyclerView recyclerView = getFragmentHomeRecyclerView();
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        HomeAdapter homeAdapter = new HomeAdapter(getContext(), dataList);
        recyclerView.setAdapter(homeAdapter);

        return getFragmentHomeBinding().getRoot();
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
}