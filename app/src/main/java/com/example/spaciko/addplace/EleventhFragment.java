package com.example.spaciko.addplace;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EleventhFragment extends Fragment {
    Context mContext;
    ArrayList<DaysModel> arrDay=new ArrayList<>();
    @BindView(R.id.tvSunday)
    AppCompatTextView tvSunday;
    @BindView(R.id.rvDays)
    RecyclerView rvDays;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_eleventh, container, false);
        mContext = getActivity();
        ButterKnife.bind(this, view);

        SpannableString string=new SpannableString(tvSunday.getText().toString());
        string.setSpan(new StyleSpan(Typeface.BOLD),4,12,0);
        tvSunday.setText(string);

        DaysModel model1=new DaysModel();
        model1.tvDay="Sunday";
        arrDay.add(model1);

        DaysModel model2=new DaysModel();
        model2.tvDay="Monday";
        arrDay.add(model2);

        DaysModel model3=new DaysModel();
        model3.tvDay="Tuesday";
        arrDay.add(model3);

        DaysModel model4=new DaysModel();
        model4.tvDay="Wednesday";
        arrDay.add(model4);

        DaysModel model5=new DaysModel();
        model5.tvDay="Thursday";
        arrDay.add(model5);

        DaysModel model6=new DaysModel();
        model6.tvDay="Friday";
        arrDay.add(model6);

        DaysModel model7=new DaysModel();
        model7.tvDay="Saturday";
        arrDay.add(model7);

        DaysAdapter mAdaper=new DaysAdapter(mContext,arrDay);
        rvDays.setAdapter(mAdaper);

        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new TwelfthFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(0,0,0,0,0,1);
    }
}
