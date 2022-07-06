package com.example.spaciko.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spaciko.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfilaAdapter extends RecyclerView.Adapter<ProfilaAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<ProfileModel> arrFeature;
    SetClick view;

    public ProfilaAdapter(Context mContext, ArrayList<ProfileModel> arrFeature,  SetClick view) {
        this.mContext = mContext;
        this.arrFeature = arrFeature;
        this.view=view;
    }

    public interface SetClick{
        void sendPosition(int position);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProfileModel model=arrFeature.get(position);
        holder.ivSymbol.setImageDrawable(model.ivSymbol);
        holder.tvFeature.setText(model.tvFeature);

        holder.itemView.setOnClickListener(v -> {
            view.sendPosition(position);
        });
    }

    @Override
    public int getItemCount() {
        return arrFeature.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivSymbol)
        AppCompatImageView ivSymbol;
        @BindView(R.id.tvFeature)
        AppCompatTextView tvFeature;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
