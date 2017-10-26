package com.ourincheon.studyandroid.Week7_Lab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_MyPathActivity extends AppCompatActivity {
    day1026_MyPath myView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myView = new day1026_MyPath(this);
        setContentView(myView);
        myView.setFocusable(true);
    }
}