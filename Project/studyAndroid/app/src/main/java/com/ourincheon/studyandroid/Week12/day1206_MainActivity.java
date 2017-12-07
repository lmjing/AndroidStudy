package com.ourincheon.studyandroid.Week12;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mijeong on 2017. 12. 6..
 */

public class day1206_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new day1206_MyView(this));
        setContentView(new day1207_MySurfaceView(this));
    }
}
