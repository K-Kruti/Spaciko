package com.example.spaciko.MainBaseActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.spaciko.Home.HomeActivity;
import com.example.spaciko.R;
import com.example.spaciko.addplace.AddPlaceActivity;
import com.example.spaciko.profile.MainProfileActivity;

public class MainBaseActivity extends AppCompatActivity {

    ImageView ivCompass;
    ImageView ivCalendar;
    ImageView ivAdd;
    ImageView ivComment;
    ImageView ivUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("MainBaseActivity","Checking");
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_base);
    }

    @Override
    public void setContentView(int layoutResID) {

        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(this).inflate(R.layout.activity_main_base,null);
        FrameLayout fmLayout = constraintLayout.findViewById(R.id.fmLayout);
        ivCompass = constraintLayout.findViewById(R.id.ivCompass);
        ivCalendar = constraintLayout.findViewById(R.id.ivCalendar);
        ivAdd = constraintLayout.findViewById(R.id.ivAdd);
        ivComment = constraintLayout.findViewById(R.id.ivComment);
        ivUser = constraintLayout.findViewById(R.id.ivUser);

        LayoutInflater.from(this).inflate(layoutResID, fmLayout,true);
        super.setContentView(constraintLayout);
    }

    public void UpdateUI(int menu){
        Log.e("Inside Switch","Checking");

        ivCompass.setOnClickListener(v -> {
            if(!(MainBaseActivity.this.getApplicationContext() instanceof HomeActivity)){
                Log.e("Inside onClickListener If","Checking");
                Intent i = new Intent(MainBaseActivity.this, HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainBaseActivity.this.startActivity(i);
                MainBaseActivity.this.finish();
                MainBaseActivity.this.overridePendingTransition(0, 0);
            }
        });

        ivAdd.setOnClickListener(v -> {
            if(!(MainBaseActivity.this.getApplicationContext() instanceof AddPlaceActivity)){
                Intent i2=new Intent(MainBaseActivity.this,AddPlaceActivity.class);
                i2.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainBaseActivity.this.startActivity(i2);
                MainBaseActivity.this.finish();
                MainBaseActivity.this.overridePendingTransition(0,0);
            }
        });

        ivUser.setOnClickListener(v -> {
            if (!(MainBaseActivity.this.getApplicationContext() instanceof MainProfileActivity)){
                Intent i5=new Intent(MainBaseActivity.this,MainProfileActivity.class);
                i5.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainBaseActivity.this.startActivity(i5);
                MainBaseActivity.this.finish();
                MainBaseActivity.this.overridePendingTransition(0,0);
            }
        });

        switch (menu){
            case 1 :
                Log.e("check home","true");
                ivCompass.setImageResource(R.drawable.ic_campas_themecolor);
                ivCalendar.setImageResource(R.drawable.ic_calender);
                ivAdd.setImageResource(R.drawable.ic_add);
                ivComment.setImageResource(R.drawable.ic_comment);
                ivUser.setImageResource(R.drawable.ic_user);
                break;
            case 2 :
                Log.e("check calendar","true");
                ivCompass.setImageResource(R.drawable.ic_campas);
                ivCalendar.setImageResource(R.drawable.ic_calendar_themecolor);
                ivAdd.setImageResource(R.drawable.ic_add);
                ivComment.setImageResource(R.drawable.ic_comment);
                ivUser.setImageResource(R.drawable.ic_user);
                break;
            case 3 :
                Log.e("check addPlace","true");
                ivCompass.setImageResource(R.drawable.ic_campas);
                ivCalendar.setImageResource(R.drawable.ic_calender);
                ivAdd.setImageResource(R.drawable.ic_add_big);
                ivComment.setImageResource(R.drawable.ic_comment);
                ivUser.setImageResource(R.drawable.ic_user);

                break;
            case 4 :
                Log.e("check review","true");
                ivCompass.setImageResource(R.drawable.ic_campas);
                ivCalendar.setImageResource(R.drawable.ic_calender);
                ivAdd.setImageResource(R.drawable.ic_add);
                ivComment.setImageResource(R.drawable.ic_comment_themecolor);
                ivUser.setImageResource(R.drawable.ic_user);
                break;
            case 5 :
                Log.e("check profile","true");
                ivCompass.setImageResource(R.drawable.ic_campas);
                ivCalendar.setImageResource(R.drawable.ic_calender);
                ivAdd.setImageResource(R.drawable.ic_add);
                ivComment.setImageResource(R.drawable.ic_comment);
                ivUser.setImageResource(R.drawable.ic_user_themecolor);
                break;
        }
    }
}
