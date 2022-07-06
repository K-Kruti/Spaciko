package com.example.spaciko.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import com.example.spaciko.MainBaseActivity.MainBaseActivity;
import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends MainBaseActivity implements AdapterView.OnItemSelectedListener {
    Context mContext;
    String[] Gender = {"Gender", "Male", "Female", "Other"};
    @BindView(R.id.spGender)
    Spinner spGender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        mContext = ProfileActivity.this;

        init();

        spGender.setOnItemSelectedListener(this);
        GenderSpinnerAdapter genderAddapter = new GenderSpinnerAdapter(mContext, Gender);
        spGender.setAdapter(genderAddapter);

    }

    private void init() {
        UpdateUI(5);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @OnClick(R.id.ivBackArrow)
    public void onViewClicked() {
        finish();
    }
}
