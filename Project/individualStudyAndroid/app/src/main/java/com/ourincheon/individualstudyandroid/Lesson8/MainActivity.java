package com.ourincheon.individualstudyandroid.Lesson8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ourincheon.individualstudyandroid.Lesson8.View.ComplexShape;
import com.ourincheon.individualstudyandroid.Lesson8.View.SimpleShape;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ComplexShape(this));
    }
}
