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

public class Hotels extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View hotels = inflater.inflate(R.layout.view_pager, container, false);

        ArrayList<ViewData> arrayList = new ArrayList<>();

        arrayList.add(new ViewData(R.drawable.kempinski_nile, "Kempinski Nile Hotel Cairo", getString(R.string.kempinski_nile), getString(R.string.kempinski_nile_location)));
        arrayList.add(new ViewData(R.drawable.fairmont_nile, "Fairmont Nile City", getString(R.string.fairmont_nile), getString(R.string.fairmont_nile_location)));
        arrayList.add(new ViewData(R.drawable.novotel, "Novotel Cairo Airport", getString(R.string.novotel), getString(R.string.novotel_location)));
        arrayList.add(new ViewData(R.drawable.steigenberger, "Steigenberger Hotel El Tahrir", getString(R.string.steigenberger), getString(R.string.steigenberger_location)));
        arrayList.add(new ViewData(R.drawable.dusit_thani, "Dusit Thani LakeView Cairo", getString(R.string.dusit_thani), getString(R.string.dusit_thani_location)));
        arrayList.add(new ViewData(R.drawable.hilton, "Hilton Cairo Heliopolis", getString(R.string.hilton), getString(R.string.hilton_location)));

        RecyclerView recyclerView = hotels.findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hotels.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        RecycleViewPager adapter = new RecycleViewPager(arrayList);

        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return hotels;
    }
}
