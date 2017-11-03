package com.ourincheon.studyandroid.HomeWork_Lab3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 3..
 */

public class MotionEventActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_event);

        RelativeLayout myLayout = (RelativeLayout) findViewById(R.id.RelativeLayout1);
        myLayout.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                handleTouch(motionEvent);
                return true;
            }
        });
    }

    void handleTouch(MotionEvent m) {
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        int pointerCount = m.getPointerCount();
        Log.i("pointerCount", String.valueOf(pointerCount));

        for (int i = 0; i < pointerCount; i++) {
            int x = (int) m.getX();
            int y = (int) m.getY();
            int id = m.getPointerId(i);
            int action = m.getActionMasked();
            int actionIndex = m.getActionIndex();
            String actionString;

            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    actionString = "DOWN";
                    break;
                case MotionEvent.ACTION_UP:
                    actionString = "UP";
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "PNTR DOWN";
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionString = "PNTR UP";
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionString = "MOVE";
                    break;
                default:
                    actionString = "";
            }

            String touchStatus = "Action: " + actionString + " Index: " + actionIndex
                    + " ID: " + id + " x: " + x + " y: " + y;

            if(id == 0)
                textView1.setText(touchStatus);
            else
                textView2.setText(touchStatus);
        }
    }
}
