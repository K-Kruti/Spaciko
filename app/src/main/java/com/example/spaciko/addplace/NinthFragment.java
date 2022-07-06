package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NinthFragment extends Fragment {
    Context mContext;
    @BindView(R.id.tvDetail)
    AppCompatTextView tvDetail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_ninth, container, false);
        mContext = getActivity();
        ButterKnife.bind(this, view);

//        tvDetail.setText(R.string.spaciko_is_unique);
        SpannableString string = new SpannableString(tvDetail.getText().toString());
        string.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.colorPrimary)), 6, 13, 0);
        tvDetail.setText(string, TextView.BufferType.SPANNABLE);

        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new TenthFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(0,0,0,1,0,0);
    }
}
