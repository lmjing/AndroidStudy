package com.ourincheon.individualstudyandroid.Lesson7.DatePicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

import java.util.Date;

/**
 * Created by mijeong on 2017. 12. 11..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker_main_activity);

        final TextView textView = (TextView)findViewById(R.id.textView);
        DatePicker datePicker = (DatePicker)findViewById(R.id.datePicker);

        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                textView.setText(String.format("%d-%d-%d",year,month,day));
            }
        });
    }
}
