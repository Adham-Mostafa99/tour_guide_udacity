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

public class Historical extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View historical =inflater.inflate(R.layout.view_pager,container,false);

        ArrayList<ViewData> arrayList = new ArrayList<>();

        arrayList.add(new ViewData(R.drawable.dahshur, getString(R.string.dahshur_name), getString(R.string.dahshur), getString(R.string.dahshur_location)));
        arrayList.add(new ViewData(R.drawable.gizuah, getString(R.string.gizuah_name), getString(R.string.gizuah), getString(R.string.gizuah_location)));
        arrayList.add(new ViewData(R.drawable.sakkara, getString(R.string.memphis_and_sakkara_name), getString(R.string.memphis_and_sakkara), getString(R.string.memphis_and_sakkara_location)));
        arrayList.add(new ViewData(R.drawable.azhar, getString(R.string.mosque_of_al_azhar_name), getString(R.string.mosque_of_al_azhar), getString(R.string.mosque_of_al_azhar_location)));
        arrayList.add(new ViewData(R.drawable.sultan_hassan, getString(R.string.mosque_of_sultan_hassan_name), getString(R.string.mosque_of_sultan_hassan), getString(R.string.mosque_of_sultan_hassan_location)));
        arrayList.add(new ViewData(R.drawable.ibn_tulun, getString(R.string.mosque_of_ibn_tulun_name), getString(R.string.mosque_of_ibn_tulun), getString(R.string.mosque_of_ibn_tulun_location)));

        RecyclerView recyclerView = historical.findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(historical.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        RecycleViewPager adapter = new RecycleViewPager(arrayList);

        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return historical;
    }
}
