package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TenthFragment extends Fragment {
    Context mContext;
    @BindView(R.id.tvOneMinRule)
    AppCompatTextView tvOneMinRule;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_tenth, container, false);
        mContext = getActivity();
        ButterKnife.bind(this, view);

        SpannableString string = new SpannableString(tvOneMinRule.getText().toString());
        string.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mContext,R.color.colorBlack)),7,24,0);
        string.setSpan(new UnderlineSpan(),7,24,0);
        tvOneMinRule.setText(string);

        return view;
    }

    @OnClick(R.id.btnContinue)
    public void onViewClicked() {
        AddPlaceActivity.addPlaceActivity.changeFragment(new EleventhFragment());
        AddPlaceActivity.addPlaceActivity.setSecondView(0,0,0,0,1,0);
    }
}
