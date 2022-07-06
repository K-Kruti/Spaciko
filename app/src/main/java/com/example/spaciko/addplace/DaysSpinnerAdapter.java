package com.example.spaciko.addplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.spaciko.R;

public class DaysSpinnerAdapter extends BaseAdapter {
    Context mContext;
    String[] status;
    public DaysSpinnerAdapter(Context mContext, String[] status) {
        this.mContext=mContext;
        this.status=status;
    }

    @Override
    public int getCount() {
        return status.length;
    }

    @Override
    public Object getItem(int position) {
        return status[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_gender_row,null);
        TextView tvSpinner=(TextView)view.findViewById(R.id.tvSpinner);
        tvSpinner.setText(status[position]);

        return view;
    }
}
