package com.example.spaciko.addplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;
import com.example.spaciko.profile.GenderSpinnerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.MyViewHolder> implements AdapterView.OnItemSelectedListener {
    Context mContext;
    ArrayList<DaysModel> arrDay;
    @BindView(R.id.spOpenClose)
    Spinner spOpenClose;
    @BindView(R.id.spHour)
    Spinner spHour;

    String[] status={"Open","Close"};
    String[] hours={"All","Hours"};

    public DaysAdapter(Context mContext, ArrayList<DaysModel> arrDay) {
        this.mContext = mContext;
        this.arrDay = arrDay;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.day_row, parent, false);
        ButterKnife.bind(this,view);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DaysModel model=arrDay.get(position);
        holder.tvDay.setText(model.tvDay);

        spOpenClose.setOnItemSelectedListener(this);
        DaysSpinnerAdapter adapter=new DaysSpinnerAdapter(mContext,status);
        spOpenClose.setAdapter(adapter);

        spHour.setOnItemSelectedListener(this);
        DaysSpinnerAdapter adapter2=new DaysSpinnerAdapter(mContext,hours);
        spHour.setAdapter(adapter2);
    }

    @Override
    public int getItemCount() {
        return arrDay.size();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvDay)
        AppCompatTextView tvDay;
        @BindView(R.id.spOpenClose)
        Spinner spOpenClose;
        @BindView(R.id.cardView1)
        CardView cardView1;
        @BindView(R.id.spHour)
        Spinner spHour;
        @BindView(R.id.cardView2)
        CardView cardView2;
        @BindView(R.id.tvLine)
        AppCompatTextView tvLine;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
