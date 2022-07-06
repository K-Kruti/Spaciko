package com.example.spaciko.profile;

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
import com.example.spaciko.addplace.RadioButtonModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DisputeCenterFragment extends Fragment {
    Context mContext;
    ArrayList<RadioButtonModel> arrDispute;
    @BindView(R.id.rvDispute)
    RecyclerView rvDispute;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_dispute_center, container, false);

        mContext = getActivity();
        ButterKnife.bind(this, view);

        if (arrDispute != null) {
            arrDispute.clear();
        } else {
            arrDispute = new ArrayList<>();
        }

        RadioButtonModel model1 = new RadioButtonModel();
        model1.radioText = "The listing description or pics are misleading and does not match reality";
        arrDispute.add(model1);

        RadioButtonModel model2 = new RadioButtonModel();
        model2.radioText = "The listing is currently occupied by others.";
        arrDispute.add(model2);

        RadioButtonModel model3 = new RadioButtonModel();
        model3.radioText = "The listing is not clean";
        arrDispute.add(model3);

        RadioButtonModel model4 = new RadioButtonModel();
        model4.radioText = "Damage Claim";
        arrDispute.add(model4);

        RadioButtonModel model5 = new RadioButtonModel();
        model5.radioText = "The listing is closed and I can't access the listing. I tried contacting the host";
        arrDispute.add(model5);

        DisputeAdapter mAdapter = new DisputeAdapter(mContext, arrDispute);
        rvDispute.setAdapter(mAdapter);

        return view;
    }

    @OnClick(R.id.ivBackArrow)
    public void onViewClicked() {
        getFragmentManager().popBackStackImmediate();
    }
}
