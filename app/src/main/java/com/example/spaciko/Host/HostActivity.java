package com.example.spaciko.Host;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.spaciko.LogIn_Register.LogInActivity;
import com.example.spaciko.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HostActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_host);
        mContext = HostActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBecomeHost)
    public void onViewClicked() {
        Intent intent=new Intent(mContext,LogInActivity.class);
        startActivity(intent);
    }
}
