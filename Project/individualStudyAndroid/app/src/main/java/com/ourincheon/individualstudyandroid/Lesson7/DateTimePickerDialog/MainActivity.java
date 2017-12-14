package com.ourincheon.individualstudyandroid.Lesson7.DateTimePickerDialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by mijeong on 2017. 12. 11..
 */

public class MainActivity extends AppCompatActivity {
    static final int Date_Dialog_ID = 1;
    static final int Time_Dialog_ID = 2;

    private int mYear, mMonth, mDay, mHour, mMinute;

    public MainActivity() {
        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        mHour = c.get(Calendar.HOUR);
        mMinute = c.get(Calendar.MINUTE);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson7_date_time_pickerdialog_main_activity);

        Button datePickerButton = (Button)findViewById(R.id.datePickerButton);
        Button timePickerButton = (Button)findViewById(R.id.timePickerButton);

        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(Date_Dialog_ID).show();
            }
        });
        timePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(Time_Dialog_ID).show();
            }
        });
    }

    Dialog createDialog(int id) {
        switch (id) {
            case Date_Dialog_ID:
                return new DatePickerDialog(this, mDateSetListener, mYear, mMonth, mDay);
            case Time_Dialog_ID:
                return new TimePickerDialog(this, mTimeSetListener, mHour, mMinute, false);
        }
        return null;
    }

    DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            Toast.makeText(getApplicationContext(), String.format(Locale.KOREA, "날짜 : %d-%d-%d", year, month, day), Toast.LENGTH_SHORT).show();
        }
    };

    TimePickerDialog.OnTimeSetListener mTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            Toast.makeText(getApplicationContext(), String.format(Locale.KOREA, "시간 : %d:%d", hour, minute), Toast.LENGTH_SHORT).show();
        }
    };
}
