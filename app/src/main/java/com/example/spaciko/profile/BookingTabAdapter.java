package com.example.spaciko.profile;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BookingTabAdapter extends FragmentPagerAdapter {
    Context mContext;
    int tabCount;
    public BookingTabAdapter(Context mContext, FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager,tabCount);
        this.mContext=mContext;
        this.tabCount=tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                UpcomingFragment upcomingFragment = new UpcomingFragment();
                return upcomingFragment;
            case 1:
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
