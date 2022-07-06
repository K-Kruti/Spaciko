package com.example.spaciko.LogIn_Register;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LogInActivity extends AppCompatActivity {
    Context mContext;
    @BindView(R.id.tvNotMember)
    AppCompatTextView tvNotMember;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mContext = LogInActivity.this;
        ButterKnife.bind(this);

//        SpannableString string = new SpannableString(tvNotMember.getText().toString());
//        string.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorPrimary)),0,tvNotMember.length(),0);
//        tvNotMember.setText(string.toString());

    }

    @OnClick(R.id.tvRegister)
    public void onViewClicked() {
        Intent intent=new Intent(mContext,RegisterActivity.class);
        startActivity(intent);
    }
}
