package com.example.spaciko.addplace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.spaciko.R;

class CalendarAdapter extends BaseAdapter {
    Context mContext;
    String[] time;
    public CalendarAdapter(Context mContext, String[] time) {
        this.mContext=mContext;
        this.time=time;
    }

    @Override
    public int getCount() {
        return time.length;
    }

    @Override
    public Object getItem(int position) {
        return time[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.month_row,null);
        TextView txt= (TextView)view.findViewById(R.id.tvMonth);
        txt.setText(time[position]);
        return view;
    }
}
