package com.example.spaciko.LogIn_Register;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {
    Context mContext;
    @BindView(R.id.rbTerms)
    AppCompatRadioButton rbTerms;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        mContext = RegisterActivity.this;

        SpannableStringBuilder sb = new SpannableStringBuilder();
        String txt1 = "By signing up, I agree to spaciko's, ";
        sb.append(txt1);

        String txt2 = "Terms and Conditions";
        SpannableString spannableString = new SpannableString(txt2);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mContext,R.color.colorPrimary)), 0, spannableString.length(), 0);
        sb.append(spannableString);

        String txt3 = ", Privacy Policy, Guest Refund, consent disagree";
        sb.append(txt3);

        rbTerms.setText(sb, TextView.BufferType.SPANNABLE);


    }

    @OnClick(R.id.tvLogIn)
    public void onViewClicked() {
        Intent intent=new Intent(mContext,LogInActivity.class);
        startActivity(intent);
    }
}
