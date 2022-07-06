package com.example.spaciko.Home;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.spaciko.MainBaseActivity.MainBaseActivity;
import com.example.spaciko.R;

public class HomeActivity extends MainBaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        Log.e("HomeActivity","Checking");
    }

    private void init() {
        UpdateUI(1);
    }
}
