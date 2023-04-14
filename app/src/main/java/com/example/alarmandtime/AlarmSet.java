package com.example.alarmandtime;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Locale;

public class AlarmSet extends AppCompatActivity {
    TimePicker alarm_time_set;
    TextView sun,mon,tue,wed,thu,fri,sat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_set);

        alarm_time_set= findViewById(R.id.alarm_time_picker);
        sun = findViewById(R.id.sun);
        mon = findViewById(R.id.mon);
        tue = findViewById(R.id.tue);
        wed = findViewById(R.id.wed);
        thu = findViewById(R.id.thu);
        fri = findViewById(R.id.fri);
        sat = findViewById(R.id.sat);


        alarm_time_set= findViewById(R.id.alarm_time_picker);
        int hour, minute;
        String amPm;

        if (Build.VERSION.SDK_INT >= 23) {
            hour = alarm_time_set.getHour();
            minute = alarm_time_set.getMinute();
        } else {
            hour = alarm_time_set.getCurrentHour();
            minute = alarm_time_set.getCurrentMinute();
        }

        if (hour >= 12) {
            amPm = "PM";
            hour -= 12;
        } else {
            amPm = "AM";
        }

        String time = String.format(Locale.getDefault(), "%02d:%02d %s", hour, minute, amPm);


    sun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sun.setBackgroundResource(R.drawable.shape);
        }
    });

    mon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mon.setBackgroundResource(R.drawable.shape);
        }
    });

    tue.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tue.setBackgroundResource(R.drawable.shape);
        }
    });

    wed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            wed.setBackgroundResource(R.drawable.shape);
        }
    });

    thu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            thu.setBackgroundResource(R.drawable.shape);
        }
    });

    fri.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fri.setBackgroundResource(R.drawable.shape);
        }
    });

    sat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sat.setBackgroundResource(R.drawable.shape);
        }
    });

    }
}