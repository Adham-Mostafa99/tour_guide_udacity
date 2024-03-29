package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    Context context;

    public FragmentAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Historical();
            case 1:
                return new Restaurants();
            case 2:
                return new Hotels();
            default:
                return new Cafes();

        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.historical_fragment);
            case 1:
                return context.getString(R.string.restaurants_fragment);
            case 2:
                return context.getString(R.string.hotels_fragment);
            default:
                return context.getString(R.string.cafes_fragment);

        }    }
}
