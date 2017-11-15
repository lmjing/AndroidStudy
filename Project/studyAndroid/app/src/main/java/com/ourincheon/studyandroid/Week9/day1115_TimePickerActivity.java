package com.ourincheon.studyandroid.Week9;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.ourincheon.studyandroid.R;

import java.util.Locale;

/**
 * Created by mijeong on 2017. 11. 15..
 */

public class day1115_TimePickerActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1115_timepicker);

        textView = (TextView)findViewById(R.id.textView);
        final TimePicker timePicker = (TimePicker)findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(this);

        Button button = (Button)findViewById(R.id.btnToggle24);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setIs24HourView( !timePicker.is24HourView() );
            }
        });
    }

    @Override
    public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
        textView.setText(String.format(Locale.KOREA, "%d:%d", hour, minute));
    }
}
