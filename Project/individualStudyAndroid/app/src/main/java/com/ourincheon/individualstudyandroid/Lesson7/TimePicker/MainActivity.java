package com.ourincheon.individualstudyandroid.Lesson7.TimePicker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.ourincheon.individualstudyandroid.R;

import java.util.Locale;

/**
 * Created by mijeong on 2017. 12. 11..
 */

//public class MainActivity extends AppCompatActivity {
//    TimePicker timePicker;
//    TextView textView;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.lesson7_timepicker_main_activity);
//
//        timePicker = (TimePicker)findViewById(R.id.timePicker);
//        textView = (TextView)findViewById(R.id.textView);
//        Button button = (Button)findViewById(R.id.button);
//
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//                textView.setText(String.format(Locale.KOREA, "%d:%d", hour, minute));
//            }
//        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                timePicker.setIs24HourView(!timePicker.is24HourView());
//            }
//        });
//    }
//}

public class MainActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener {
    TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson7_timepicker_main_activity);

        timePicker = (TimePicker)findViewById(R.id.timePicker);
        textView = (TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.button);

        timePicker.setOnTimeChangedListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setIs24HourView(!timePicker.is24HourView());
            }
        });
    }

    @Override
    public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
        textView.setText(String.format(Locale.KOREA, "%d:%d", hour, minute));
    }
}
