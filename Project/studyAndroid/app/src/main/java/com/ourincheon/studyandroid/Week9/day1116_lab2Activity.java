package com.ourincheon.studyandroid.Week9;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.ourincheon.studyandroid.R;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by mijeong on 2017. 11. 16..
 */

public class day1116_lab2Activity extends AppCompatActivity {

    static final int DATE_DIALOG = 99, TIME_DIALOG = 100;

    int mYear, mMonth, mDay, mHour, mMinute;

    EditText dateEditText, timeEditText;

    public day1116_lab2Activity() {
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
        setContentView(R.layout.day1116_lab2);

        dateEditText = (EditText)findViewById(R.id.editText);
        timeEditText = (EditText)findViewById(R.id.editText2);

        Button btnSetDate = (Button)findViewById(R.id.button);
        btnSetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(DATE_DIALOG).show();
            }
        });

        Button btnSetTime = (Button)findViewById(R.id.button2);
        btnSetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(TIME_DIALOG).show();
            }
        });
    }

    protected Dialog createDialog(int id) {
        Dialog dialog = null;
        switch (id) {
            case DATE_DIALOG:
                // NOTE: m이 붙으면 global member로 선언하겠다는 것
                dialog = new DatePickerDialog(this, dateListener, mYear, mMonth, mDay);
                break;
            case TIME_DIALOG:
                dialog = new TimePickerDialog(this, timeListener, mHour, mMinute, false);
                break;
        }
        return dialog;
    }

    DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
            int flags = 0;
            flags |= android.text.format.DateUtils.FORMAT_SHOW_YEAR;
            flags |= android.text.format.DateUtils.FORMAT_NUMERIC_DATE; // FORMAT_ABBREV_MONTH
            flags |= android.text.format.DateUtils.FORMAT_SHOW_DATE;
            flags |= android.text.format.DateUtils.FORMAT_SHOW_WEEKDAY;

            mYear = year;
            mMonth = month;
            mDay = dayOfMonth;
            Calendar cal = new GregorianCalendar(year, month, dayOfMonth);
            String date = DateUtils.formatDateTime(getApplicationContext(),
                    cal.getTimeInMillis(), flags);
                    /*Toast.makeText(getApplicationContext(),
                            "날짜: " + date, Toast.LENGTH_SHORT).show();*/
            dateEditText.setText(date);
        }
    };

    TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
            mHour = hourOfDay;
            mMinute = minute;
            Calendar cal = new GregorianCalendar(mYear, mMonth, mDay, mHour, mMinute);
            String time = DateUtils.formatDateTime(getApplicationContext(),
                    cal.getTimeInMillis(),
                    DateUtils.FORMAT_SHOW_TIME);
                    /*Toast.makeText(getApplicationContext(),
                            "시간: " + time, Toast.LENGTH_SHORT).show();*/
            timeEditText.setText(time);
        }
    };
}
