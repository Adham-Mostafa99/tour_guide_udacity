package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurants extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View restaurants = inflater.inflate(R.layout.view_pager, container, false);

        ArrayList<ViewData> arrayList = new ArrayList<>();

        arrayList.add(new ViewData(R.drawable.maison_thomas, "Maison Thomas", getString(R.string.maison_thomas), getString(R.string.maison_thomas_location)));
        arrayList.add(new ViewData(R.drawable.pane_vino_restaurant, "Pane Vino Restaurant", getString(R.string.pane_vino_restaurant), getString(R.string.pane_vino_restaurant_location)));
        arrayList.add(new ViewData(R.drawable.lucca, "Lucca", getString(R.string.lucca), getString(R.string.lucca_location)));
        arrayList.add(new ViewData(R.drawable.steakhouse, "JW's Steakhouse", getString(R.string.jWs_steakhouse), getString(R.string.jWs_steakhouse_location)));
        arrayList.add(new ViewData(R.drawable.romanov, "Romanov", getString(R.string.romanov), getString(R.string.romanov_location)));
        arrayList.add(new ViewData(R.drawable.steak_corner, " Steak Corner", getString(R.string.steak_corner), getString(R.string.steak_corner_location)));

        RecyclerView recyclerView = restaurants.findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(restaurants.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        RecycleViewPager adapter = new RecycleViewPager(arrayList);

        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return restaurants;
    }
}
