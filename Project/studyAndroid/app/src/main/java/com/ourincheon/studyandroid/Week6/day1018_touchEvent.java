package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 18..
 */

public class tday1018_touchEvent extends AppCompatActivity {

    TextView textView = (TextView)findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1018_touch);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        showTouchInfo("터치 다운", x, y); break;
                    case MotionEvent.ACTION_UP:
                        showTouchInfo("터치 업", x, y); break;
                    case MotionEvent.ACTION_MOVE:
                        showTouchInfo("터치 이동", x, y); break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    public void showTouchInfo(String message, float x, float y) {
        textView.append(message + x + ", "+ y + "\n");
    }
}
