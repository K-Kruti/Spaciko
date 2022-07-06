package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SixthFragment extends Fragment {
    Context mContext;
    ArrayList<RadioButtonModel> arrAccess;
    @BindView(R.id.tvGuestAccess)
    AppCompatTextView tvGuestAccess;
    @BindView(R.id.rvAccess)
    RecyclerView rvAccess;
    @BindView(R.id.btnContinue)
    AppCompatButton btnContinue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_sixth, container, false);
        ButterKnife.bind(this, view);
        mContext = getActivity();

        if (arrAccess !=null){
            arrAccess.clear();
        }
        else {
            arrAccess=new ArrayList<>();
        }

        RadioButtonModel model1 = new RadioButtonModel();
        model1.radioText = "Delivery Access";
        arrAccess.add(model1);

        RadioButtonModel model2 = new RadioButtonModel();
        model2.radioText = "Garage Door";
        arrAccess.add(model2);

        RadioButtonModel model3 = new RadioButtonModel();
        model3.radioText = "Elevator";
        arrAccess.add(model3);

        RadioButtonModel model4 = new RadioButtonModel();
        model4.radioText = "Parking Near By";
        arrAccess.add(model4);

        RadioButtonModel model5 = new RadioButtonModel();
        model5.radioText = "Stairs";
        arrAccess.add(model5);

        RadioListAdapter mAdapter = new RadioListAdapter(mContext, arrAccess);
        rvAccess.setAdapter(mAdapter);

        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new SeventhFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(1,0,0,0,0,0);
    }
}
