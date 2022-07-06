package com.example.spaciko.SplashActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.spaciko.MainActivity;
import com.example.spaciko.R;

import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext=SplashActivity.this;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(mContext, MainActivity.class);
                startActivity(intent);

                finish();
            }
        },3000);
    }
}
