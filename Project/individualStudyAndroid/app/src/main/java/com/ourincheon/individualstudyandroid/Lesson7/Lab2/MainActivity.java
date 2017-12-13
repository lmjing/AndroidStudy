package com.ourincheon.individualstudyandroid.Lesson7.Lab2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.TimeUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.ourincheon.individualstudyandroid.R;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by mijeong on 2017. 12. 13..
 */

public class MainActivity extends AppCompatActivity {

    static final int DATE_DIALOG_ID = 1;
    static final int TIME_DIALOG_ID = 2;

    EditText dateEditText, timeEditText;
    int mYear, mMonth, mDay, mHour, mMinute;

    public MainActivity() {
        Calendar c = Calendar.getInstance();
        // 안에 매개변수 유의
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        mHour = c.get(Calendar.HOUR);
        mMinute = c.get(Calendar.MINUTE);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_reservation_main_activity);

        Button datePickerButton = (Button)findViewById(R.id.datePickerButton);
        Button timePickerButton = (Button)findViewById(R.id.timePickerButton);

        dateEditText = (EditText)findViewById(R.id.dateEditText);
        timeEditText = (EditText)findViewById(R.id.timeEditText);

        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(DATE_DIALOG_ID).show();
            }
        });

        timePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(TIME_DIALOG_ID).show();
            }
        });
    }

    Dialog createDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                //매개변수!!!
                return new DatePickerDialog(MainActivity.this, dateSetListener, mYear, mMonth, mDay);
            case TIME_DIALOG_ID:
                return new TimePickerDialog(MainActivity.this, timeSetListener, mHour, mMinute, false);
        }
        return null;
    }

    DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            // 암기!!!
            int flags = 0;
            flags |= DateUtils.FORMAT_SHOW_YEAR;
            flags |= DateUtils.FORMAT_NUMERIC_DATE;
            flags |= DateUtils.FORMAT_SHOW_DATE;
            flags |= DateUtils.FORMAT_SHOW_WEEKDAY;

            mYear = year;
            mMonth = month;
            mDay = day;

            Calendar cal = new GregorianCalendar(year, month, day);
            String date = DateUtils.formatDateTime(getApplicationContext(), cal.getTimeInMillis(), flags);
            dateEditText.setText(date);
        }
    };

    TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            mHour = hour;
            mMinute = minute;

            Calendar cal = new GregorianCalendar(mYear, mMonth, mDay, hour, minute);
            String time = DateUtils.formatDateTime(getApplicationContext(), cal.getTimeInMillis(), DateUtils.FORMAT_SHOW_TIME);
            timeEditText.setText(time);
        }
    };
}
