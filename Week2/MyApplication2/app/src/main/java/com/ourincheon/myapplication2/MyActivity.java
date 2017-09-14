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
        String str = getString(R.string.my_msg);
        tv.setText(str); // android:text = " ... "과 동일
    }
}
