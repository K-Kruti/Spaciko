package com.example.spaciko.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.MainBaseActivity.MainBaseActivity;
import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainProfileActivity extends MainBaseActivity implements ProfilaAdapter.SetClick {
    Context mContext;
    ArrayList<ProfileModel> arrFeature = new ArrayList<>();

    @BindView(R.id.topBackground)
    AppCompatTextView topBackground;
    @BindView(R.id.ivProfile)
    AppCompatImageView ivProfile;
    @BindView(R.id.tvName)
    AppCompatTextView tvName;
    @BindView(R.id.BtnMyPofile)
    AppCompatButton BtnMyPofile;
    @BindView(R.id.rvProfile)
    RecyclerView rvProfile;
    @BindView(R.id.constraintLayoutProfile)
    ConstraintLayout constraintLayoutProfile;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);
        mContext = MainProfileActivity.this;
        ButterKnife.bind(this);
        init();

        ProfileModel model1 = new ProfileModel();
        model1.tvFeature = "Settings";
        model1.ivSymbol = this.getDrawable(R.drawable.ic_settings);
        arrFeature.add(model1);

        ProfileModel model2 = new ProfileModel();
        model2.tvFeature = "Help and Support";
        model2.ivSymbol = this.getDrawable(R.drawable.ic_help);
        arrFeature.add(model2);

        ProfileModel model3 = new ProfileModel();
        model3.tvFeature = "My Listings";
        model3.ivSymbol = this.getDrawable(R.drawable.ic_listing);
        arrFeature.add(model3);

        ProfileModel model4 = new ProfileModel();
        model4.tvFeature = "My Reservation";
        model4.ivSymbol = this.getDrawable(R.drawable.ic_dispute);
        arrFeature.add(model4);

        ProfileModel model5 = new ProfileModel();
        model5.tvFeature = "Dispute center";
        model5.ivSymbol = this.getDrawable(R.drawable.ic_dispute);
        arrFeature.add(model5);

        ProfileModel model6 = new ProfileModel();
        model6.tvFeature = "Contact us";
        model6.ivSymbol = this.getDrawable(R.drawable.ic_mail_outline);
        arrFeature.add(model6);


        ProfilaAdapter adapter = new ProfilaAdapter(mContext, arrFeature, this);
        rvProfile.setAdapter(adapter);

    }

    private void init() {
        UpdateUI(5);
    }

    @OnClick({R.id.ivBack, R.id.BtnMyPofile})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                finish();
                break;
            case R.id.BtnMyPofile:
                Intent intent = new Intent(mContext, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void sendPosition(int position) {
        switch (position) {
            case 3:
                BookingFragment bookingFragment=new BookingFragment();
                FragmentManager manager3=getSupportFragmentManager();
                manager3.beginTransaction()
                        .replace(R.id.fmLayout,bookingFragment).addToBackStack(null)
                        .commit();
                break;
            case 4:
                DisputeCenterFragment disputeCenterFragment=new DisputeCenterFragment();
                FragmentManager manager4=getSupportFragmentManager();
                manager4.beginTransaction()
                        .replace(R.id.fmLayout,disputeCenterFragment).addToBackStack(null)
                        .commit();
                break;
            case 5:
                ContactUsFragment contactFragment=new ContactUsFragment();
                FragmentManager manager5=getSupportFragmentManager();
                manager5.beginTransaction()
                        .replace(R.id.fmLayout,contactFragment).addToBackStack(null)
                        .commit();
                break;
        }
    }
}
