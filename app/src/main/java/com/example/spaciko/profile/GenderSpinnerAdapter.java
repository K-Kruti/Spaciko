package com.example.spaciko.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.spaciko.R;

public class GenderSpinnerAdapter extends BaseAdapter {
    Context mContext;
    String[] gender;
    public GenderSpinnerAdapter(Context mContext, String[] gender) {
        this.mContext=mContext;
        this.gender=gender;
    }

    @Override
    public int getCount() {
        return gender.length;
    }

    @Override
    public Object getItem(int position) {
        return gender[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_gender_row,null);
        TextView tvSpinner=(TextView)view.findViewById(R.id.tvSpinner);
        tvSpinner.setText(gender[position]);

        return view;
    }
}
