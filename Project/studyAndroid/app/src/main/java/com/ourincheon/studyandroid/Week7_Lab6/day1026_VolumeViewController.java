package com.ourincheon.studyandroid.Week7_Lab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_VolumeViewController extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1026_volumecontrol);

        day1026_VolumeControlView v = (day1026_VolumeControlView)findViewById(R.id.volume);
        v.setOnTouchListener(v);
    }
}
