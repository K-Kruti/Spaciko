package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;
import com.example.spaciko.profile.GenderSpinnerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    @BindView(R.id.tvReadyDeail)
    AppCompatTextView tvReadyDeail;
    String[] type = {"1-4 person Office space", "5-7 person Office space", "8-12 person Office space", "13-20 person Office space", "" +
            "Private Desk Area", "Shared Desk Area", "Open Space", "Meeting Room"};
    Context mContext;
    @BindView(R.id.spType)
    Spinner spType;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        mContext = getActivity();
        Log.e("First Fragment", "Checking");
        init();

        spType.setOnItemSelectedListener(this);
        GenderSpinnerAdapter adapter=new GenderSpinnerAdapter(mContext,type);
        spType.setAdapter(adapter);

    }

    private void init() {
        tvReadyDeail.setText(R.string.with_spaciko);
        SpannableString string = new SpannableString(tvReadyDeail.getText());
//        string.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), 5, 12, 0);
        string.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.colorPrimary)), 5, 12, 0);
        tvReadyDeail.setText(string);
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
//        SecondFragment fragment =new SecondFragment();
        AddPlaceActivity.addPlaceActivity.changeFragment(new SecondFragment());
        AddPlaceActivity.addPlaceActivity.setFirstView(0, 1, 0, 0, 0, 0);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}