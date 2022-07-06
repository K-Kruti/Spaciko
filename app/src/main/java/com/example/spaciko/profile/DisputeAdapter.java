package com.example.spaciko.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;
import com.example.spaciko.addplace.RadioButtonModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DisputeAdapter extends RecyclerView.Adapter<DisputeAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<RadioButtonModel> arrDispute;



    public DisputeAdapter(Context mContext, ArrayList<RadioButtonModel> arrDispute) {
        this.mContext = mContext;
        this.arrDispute = arrDispute;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dispute_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RadioButtonModel model = arrDispute.get(position);
        holder.tvDispute.setText(model.radioText);
    }

    @Override
    public int getItemCount() {
        return arrDispute.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvDispute)
        AppCompatTextView tvDispute;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
