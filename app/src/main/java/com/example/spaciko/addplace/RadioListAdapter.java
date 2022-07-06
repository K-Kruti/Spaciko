package com.example.spaciko.addplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RadioListAdapter extends RecyclerView.Adapter<RadioListAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<RadioButtonModel> arrAmenities;


    public RadioListAdapter(Context mContext, ArrayList<RadioButtonModel> arrAmenities) {
        this.mContext = mContext;
        this.arrAmenities = arrAmenities;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.radio_button_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final RadioButtonModel model=arrAmenities.get(position);
        holder.radioText.setText(model.radioText);
    }

    @Override
    public int getItemCount() {
        return arrAmenities.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.radioButton)
        RadioButton radioButton;
        @BindView(R.id.radioText)
        AppCompatTextView radioText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
