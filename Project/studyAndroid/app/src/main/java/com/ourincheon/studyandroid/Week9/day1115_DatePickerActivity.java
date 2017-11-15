package com.ourincheon.studyandroid.Week9;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

import java.util.Locale;

/**
 * Created by mijeong on 2017. 11. 15..
 */

public class day1115_DatePickerActivity extends AppCompatActivity {
    DatePicker mDatePicker;
    TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.day1115_datepicker);

        mDatePicker = (DatePicker)findViewById(R.id.datePicker);
        mTextView = (TextView)findViewById(R.id.textView);

        mDatePicker.init(mDatePicker.getYear(), mDatePicker.getMonth(), mDatePicker.getDayOfMonth()
                , new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                        mTextView.setText(String.format(Locale.KOREA, "%d-%d-%d", year, month + 1, day));
                    }
                });
    }
}
