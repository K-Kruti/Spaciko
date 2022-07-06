package com.example.spaciko;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.spaciko.Home.HomeActivity;
import com.example.spaciko.Host.HostActivity;
import com.example.spaciko.MainBaseActivity.MainBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Context mContext;
    @BindView(R.id.tvDetail)
    AppCompatTextView tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        ButterKnife.bind(this);

        SpannableString string = new SpannableString(tvDetail.getText());
        string.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorGreen)), 0, 7, 0);
        tvDetail.setText(string);
    }

    @OnClick({R.id.ivHostBg, R.id.ivWorkBg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivHostBg:
                Intent intent = new Intent(mContext, HostActivity.class);
                startActivity(intent);
                break;
            case R.id.ivWorkBg:
                Intent intent1=new Intent(mContext, HomeActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
