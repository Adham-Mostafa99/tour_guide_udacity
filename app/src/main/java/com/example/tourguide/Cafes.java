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

public class Cafes extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View cafes=inflater.inflate(R.layout.view_pager,container,false);

        ArrayList<ViewData> arrayList = new ArrayList<>();

        arrayList.add(new ViewData(R.drawable.zen_cafe, getString(R.string.zen_cafe_name), getString(R.string.zen_cafe), getString(R.string.zen_cafe_location)));
        arrayList.add(new ViewData(R.drawable.nagib_mafouz, getString(R.string.nagib_mafouz_name), getString(R.string.nagib_mafouz), getString(R.string.nagib_mafouz_location)));
        arrayList.add(new ViewData(R.drawable.paul, getString(R.string.paul_name), getString(R.string.paul), getString(R.string.paul_location)));
        arrayList.add(new ViewData(R.drawable.vinni_cafe, getString(R.string.vinni_cafe_name), getString(R.string.vinni_cafe), getString(R.string.vinni_cafe_location)));
        arrayList.add(new ViewData(R.drawable.cilantro, getString(R.string.cilantro_name), getString(R.string.cilantro), getString(R.string.cilantro_location)));

        RecyclerView recyclerView = cafes.findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(cafes.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        RecycleViewPager adapter = new RecycleViewPager(arrayList);

        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return cafes;
    }
}
