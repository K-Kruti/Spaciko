package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SeventhFragment extends Fragment {
    Context mContext;
    @BindView(R.id.rvImage)
    RecyclerView rvImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_seventh, container, false);
        ButterKnife.bind(this, view);
        mContext=getActivity();

        ImageAdapter mAdapter= new ImageAdapter(mContext);
        rvImage.setAdapter(mAdapter);


        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new EighthFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(0, 1, 0, 0, 0, 0);
    }
}
