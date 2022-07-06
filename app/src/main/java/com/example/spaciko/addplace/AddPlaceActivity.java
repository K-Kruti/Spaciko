package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.spaciko.MainBaseActivity.MainBaseActivity;
import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddPlaceActivity extends MainBaseActivity {
    Context mContext;

    public void setFirstView(int one, int tow, int three, int four, int five, int six) {
        consFirst.setVisibility(View.VISIBLE);
        consSecond.setVisibility(View.GONE);

//            tvToolBarTitle.text = resources.getString(R.string.lbladd);
        if (one == 1) tvOne.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvOne.setBackgroundResource(R.drawable.circle);

        if (tow == 1) tvTwo.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvTwo.setBackgroundResource(R.drawable.circle);

        if (three == 1) tvThree.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvThree.setBackgroundResource(R.drawable.circle);

        if (four == 1) tvFour.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvFour.setBackgroundResource(R.drawable.circle);

        if (five == 1) tvFive.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvFive.setBackgroundResource(R.drawable.circle);

        if (six == 1) tvSix.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvSix.setBackgroundResource(R.drawable.circle);
    }

    public void setSecondView(int seven, int eight, int nine, int ten, int eleven, int twelve) {
        consFirst.setVisibility(View.GONE);
        consSecond.setVisibility(View.VISIBLE);

//            tvToolBarTitle.text = resources.getString(R.string.lbladd);
        if (seven == 1) tvSeven.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvSeven.setBackgroundResource(R.drawable.circle);

        if (eight == 1) tvEight.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvEight.setBackgroundResource(R.drawable.circle);

        if (nine == 1) tvNine.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvNine.setBackgroundResource(R.drawable.circle);

        if (ten == 1) tvTen.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvTen.setBackgroundResource(R.drawable.circle);

        if (eleven == 1) tvEleven.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvEleven.setBackgroundResource(R.drawable.circle);

        if (twelve == 1) tvTwelve.setBackgroundResource(R.drawable.oval_blue_dark);
        else tvTwelve.setBackgroundResource(R.drawable.circle);
    }

    public static AddPlaceActivity addPlaceActivity;
    @BindView(R.id.tvOne)
    AppCompatTextView tvOne;
    @BindView(R.id.tvTwo)
    AppCompatTextView tvTwo;
    @BindView(R.id.tvThree)
    AppCompatTextView tvThree;
    @BindView(R.id.tvFour)
    AppCompatTextView tvFour;
    @BindView(R.id.tvFive)
    AppCompatTextView tvFive;
    @BindView(R.id.tvSix)
    AppCompatTextView tvSix;
    @BindView(R.id.llChanged)
    LinearLayout llChanged;
    @BindView(R.id.innerConstraintLayout)
    ConstraintLayout innerConstraintLayout;
    @BindView(R.id.consFirst)
    ConstraintLayout consFirst;
    @BindView(R.id.tvSeven)
    AppCompatTextView tvSeven;
    @BindView(R.id.tvEight)
    AppCompatTextView tvEight;
    @BindView(R.id.tvNine)
    AppCompatTextView tvNine;
    @BindView(R.id.tvTen)
    AppCompatTextView tvTen;
    @BindView(R.id.tvEleven)
    AppCompatTextView tvEleven;
    @BindView(R.id.tvTwelve)
    AppCompatTextView tvTwelve;
    @BindView(R.id.consSecond)
    ConstraintLayout consSecond;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);
        ButterKnife.bind(this);
        AddPlaceActivity.addPlaceActivity = this;
        init();
        mContext = AddPlaceActivity.this;

        changeFragment(new FirstFragment());

        setFirstView(1,0,0,0,0,0);
    }

    private void init() {
        UpdateUI(3);
    }

    public void changeFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        String backStateName = fragment.toString();
        boolean fragmentPopped = manager.popBackStackImmediate(backStateName, 0);

        if (!fragmentPopped && manager.findFragmentByTag(backStateName) == null) {
            FragmentTransaction ft = manager.beginTransaction();
            ft.replace(R.id.llChanged, fragment);
            ft.addToBackStack(backStateName);
            ft.commit();

        }
    }
}
