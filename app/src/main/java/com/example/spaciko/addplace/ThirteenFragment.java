package com.example.spaciko.addplace;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.spaciko.R;
import com.example.spaciko.profile.GenderSpinnerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ThirteenFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Context mContext;
    @BindView(R.id.calendar)
    CalendarView calendar;
    @BindView(R.id.timeSpinner)
    Spinner timeSpinner;

    String[] time = {"1 month", "3 month", "6 month"};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_thirteen, container, false);
        mContext = getActivity();
        ButterKnife.bind(this,view);

        Log.e("Thirteen Fragment", "Checking");

        timeSpinner.setOnItemSelectedListener(this);
        CalendarAdapter adapter = new CalendarAdapter(mContext, time);
        timeSpinner.setAdapter(adapter);

        //calendar.setDate(1608658542000L);
//        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//
//            }
//        });

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
