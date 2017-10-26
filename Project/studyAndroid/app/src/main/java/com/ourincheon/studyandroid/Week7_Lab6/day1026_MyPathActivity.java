package com.ourincheon.studyandroid.Week7_Lab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

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

        myView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        myView.mPath.moveTo(x, y); return true;
                    case MotionEvent.ACTION_MOVE:
                        myView.mPath.lineTo(x, y); break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default: return false;
                }

                //view를 상속받았기 때문에 인스턴스에서 접근하지 않아도 된다.
                view.invalidate();
                return true;
            }
        });
    }
}