package com.ourincheon.studyandroid.Week10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mijeong on 2017. 11. 22..
 */

public class day1122_graphicActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        day1122_graphic_View1 myView = new day1122_graphic_View1(this);
//        day1122_graphic_View2 myView = new day1122_graphic_View2(this);
        day1122_graphic_View3 myView = new day1122_graphic_View3(this);
        setContentView(myView);
    }
}
