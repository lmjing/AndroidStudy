package com.ourincheon.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView tv = (TextView)findViewById(R.id.myTextView);
        tv.setText("여기서도 바뀌네"); // android:text = " ... "과 동일
    }
}
