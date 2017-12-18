package com.ourincheon.individualstudyandroid.Lesson6.TouchEvent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

import static android.util.Log.println;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        float curX = event.getX();
        float curY = event.getY();

        if(action == MotionEvent.ACTION_DOWN) {
            touchMesage("손가락 눌림", curX, curY);
        }else if(action == MotionEvent.ACTION_MOVE) {
            touchMesage("손가락 움직임", curX, curY);
        }else if(action == MotionEvent.ACTION_UP) {
            touchMesage("손가락 뗌", curX, curY);
        }

        return true;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6_touch_event);

        textView = (TextView)findViewById(R.id.textView);
    }

    public void touchMesage(String message, float curX, float curY) {
        textView.append(message + curX + " " + curY+"\n");
    }
}
