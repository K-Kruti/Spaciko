package com.example.spaciko.addplace;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThirdFragment extends Fragment {
    @BindView(R.id.tvNo)
    AppCompatTextView tvNo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_third, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick({R.id.ivMinus, R.id.ivPlus, R.id.btnContinue})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivMinus:
                int mNo=Integer.parseInt(tvNo.getText().toString());
                if (mNo>0){
                    mNo-=1;
                    String sNoM= String.valueOf(mNo);
                    tvNo.setText(sNoM);
                }
                break;
            case R.id.ivPlus:
                int pNo=Integer.parseInt(tvNo.getText().toString());
                pNo+=1;
                String sNoP= String.valueOf(pNo);
                tvNo.setText(sNoP);
                break;
            case R.id.btnContinue:
                AddPlaceActivity.addPlaceActivity.changeFragment(new FourthFragment());
                AddPlaceActivity.addPlaceActivity.setFirstView(0,0,0,1,0,0);
                break;
        }
    }
}
