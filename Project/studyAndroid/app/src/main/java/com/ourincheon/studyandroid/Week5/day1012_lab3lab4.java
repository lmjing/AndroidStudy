package com.ourincheon.studyandroid.Week5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 12..
 */

public class day1012_lab3lab4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.day1012_lab3);

        setContentView(R.layout.day1012_lab4);
        TextView poemBody1 = (TextView)findViewById(R.id.textbody1);
        poemBody1.setSelected(true);
    }
}
