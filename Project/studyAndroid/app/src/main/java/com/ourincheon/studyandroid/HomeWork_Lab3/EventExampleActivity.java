package com.ourincheon.studyandroid.HomeWork_Lab3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 2..
 */

public class EventExampleActivity extends AppCompatActivity {

    class MyListenerClass implements Button.OnClickListener {

        @Override
        public void onClick(View view) {
            TextView textView = (TextView)findViewById(R.id.myTextView);
            textView.setText("Button Clicked");
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_example);

        Button button = (Button)findViewById(R.id.myButton);
        MyListenerClass listener = new MyListenerClass();
        button.setOnClickListener(listener);
//        button.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView textView = (TextView)findViewById(R.id.myTextView);
//                textView.setText("Button Clicked");
//            }
//        });
    }
}
