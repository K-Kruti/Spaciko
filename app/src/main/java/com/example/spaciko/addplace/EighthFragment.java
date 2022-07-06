package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EighthFragment extends Fragment {
    Context mContext;
    ArrayList<RadioButtonModel> arrGuestRule;
    @BindView(R.id.rvGuestRules)
    RecyclerView rvGuestRules;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_eighth, container, false);

        mContext = getActivity();
        ButterKnife.bind(this, view);

        if (arrGuestRule !=null){
            arrGuestRule.clear();
        }
        else {
            arrGuestRule=new ArrayList<>();
        }

        RadioButtonModel model1 = new RadioButtonModel();
        model1.radioText = "No Visitors";
        arrGuestRule.add(model1);

        RadioButtonModel model2 = new RadioButtonModel();
        model2.radioText = "No Smoking";
        arrGuestRule.add(model2);

        RadioButtonModel model3 = new RadioButtonModel();
        model3.radioText = "No Cooking";
        arrGuestRule.add(model3);

        RadioButtonModel model4 = new RadioButtonModel();
        model4.radioText = "No Loud Music";
        arrGuestRule.add(model4);

        RadioListAdapter mAdapter = new RadioListAdapter(mContext, arrGuestRule);
        rvGuestRules.setAdapter(mAdapter);

        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new NinthFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(0,0,1,0,0,0);
    }
}
