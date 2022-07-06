package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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

public class FourthFragment extends Fragment {
    Context mContext;
    ArrayList<RadioButtonModel> arrAmenities;
    @BindView(R.id.rvAmenities)
    RecyclerView rvAmenities;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_fourth, container, false);
        ButterKnife.bind(this, view);
        mContext=getActivity();

        if (arrAmenities !=null){
            arrAmenities.clear();
        }
        else {
            arrAmenities=new ArrayList<>();
        }

        RadioButtonModel model1=new RadioButtonModel();
        model1.radioText="Body Temperature Thermometer";
        arrAmenities.add(model1);

        RadioButtonModel model2=new RadioButtonModel();
        model2.radioText="Hand Sanitizer";
        arrAmenities.add(model2);

        RadioButtonModel model3=new RadioButtonModel();
        model3.radioText="Air Condition";
        arrAmenities.add(model3);

        RadioButtonModel model4=new RadioButtonModel();
        model4.radioText="ADSL Internet";
        arrAmenities.add(model4);

        RadioButtonModel model5=new RadioButtonModel();
        model5.radioText="Wireless Internet";
        arrAmenities.add(model5);

        RadioListAdapter mAdapter= new RadioListAdapter(mContext,arrAmenities);
        rvAmenities.setAdapter(mAdapter);

        return view;
    }

    @OnClick(R.id.btn4Continue)
    public void onViewClicked() {
        Log.e("ButtonClick", "Checking");
        AddPlaceActivity.addPlaceActivity.changeFragment(new FifthFragment());
        AddPlaceActivity.addPlaceActivity.setFirstView(0,0,0,0,1,0);
    }
}
