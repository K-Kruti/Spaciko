package com.example.spaciko.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactUsFragment extends Fragment {
    Context mContext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_contact_us, container, false);
        mContext = getActivity();
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick({R.id.ivBackArrow, R.id.btnSend})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivBackArrow:
                getFragmentManager().popBackStackImmediate();
                break;
            case R.id.btnSend:
                break;
        }
    }
}
