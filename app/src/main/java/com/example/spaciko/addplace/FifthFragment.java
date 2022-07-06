package com.example.spaciko.addplace;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FifthFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("Fifth Fragment", "Checking");
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_fifth, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn4Continue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new SixthFragment());
        AddPlaceActivity.addPlaceActivity.setFirstView(0,0,0,0,0,1);
    }
}
