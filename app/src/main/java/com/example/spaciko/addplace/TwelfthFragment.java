package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;
import com.example.spaciko.profile.GenderSpinnerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TwelfthFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Context mContext;
    @BindView(R.id.spinnerCancellation)
    AppCompatSpinner spinnerCancellation;
    String[] cancellationPolicy = {"In case of guest cancellation 24 hours prior to arrival, the guest will get Full refund(booking fees excluded)."
    ,"In case of guest cancellation 5 days prior to arrival, the guest will get a 75% refund(booking fees excluded)."
    ,"In case of guest cancellation 7 days prior to arrival, the guest will get a 50% refund(booking fees excluded)."};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_twelfth, container, false);
        ButterKnife.bind(this, view);
        mContext = getActivity();

        spinnerCancellation.setOnItemSelectedListener(this);
        GenderSpinnerAdapter adapter = new GenderSpinnerAdapter(mContext, cancellationPolicy);
        spinnerCancellation.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new ThirteenFragment());
    }
}
