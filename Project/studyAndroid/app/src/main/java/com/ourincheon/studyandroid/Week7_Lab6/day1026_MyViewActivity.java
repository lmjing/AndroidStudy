package com.ourincheon.studyandroid.Week7_Lab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_MyViewActivity extends AppCompatActivity {
    day1026_MyView myView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myView = new day1026_MyView(this);
        setContentView(myView);
        myView.setFocusable(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_J:
                myView.setX(-20); break;
            case KeyEvent.KEYCODE_K:
                myView.setX(20); break;
            case KeyEvent.KEYCODE_M:
                myView.setY(-20); break;
            case KeyEvent.KEYCODE_N:
                myView.setY(20); break;
        }
        myView.invalidate();
        return true;
    }
}
