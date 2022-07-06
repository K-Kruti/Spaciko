package com.example.spaciko.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.spaciko.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookingFragment extends Fragment {
    Context mContext;
    @BindView(R.id.tabBooking)
    TabLayout tabBooking;
    @BindView(R.id.viewPagerBooking)
    ViewPager viewPagerBooking;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_booking, container, false);
        mContext = getActivity();
        ButterKnife.bind(this, view);

        tabBooking.addTab(tabBooking.newTab().setText("Upcoming"));
        tabBooking.addTab(tabBooking.newTab().setText("Previous"));
        tabBooking.setTabGravity(TabLayout.GRAVITY_FILL);

        BookingTabAdapter tabAdapter= new BookingTabAdapter(mContext,getFragmentManager(),tabBooking.getTabCount());
        viewPagerBooking.setAdapter(tabAdapter);

        viewPagerBooking.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabBooking));

        tabBooking.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerBooking.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }
}
