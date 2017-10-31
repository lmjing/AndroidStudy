package com.ourincheon.studyandroid.Week7_Lab6;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_VolumeControlView extends AppCompatImageView implements View.OnTouchListener {

    final static double PI =  3.141592;
    double angle;
    float x, y;

    public day1026_VolumeControlView(Context context) {
        super(context);
        setImageResource(R.drawable.knob);
    }

    public day1026_VolumeControlView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImageResource(R.drawable.knob);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        x = motionEvent.getX();
        y = motionEvent.getY();
        angle = getAngle(x, y);
        invalidate();
        return false;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate((float)angle, getWidth()/2, getHeight()/2);
        super.onDraw(canvas);
        canvas.restore();
    }

    // 삼각함수 이용해서 앵글 구하
    private double getAngle(float x, float y){
        x = x - (getWidth()/2.0f);
        y = (getHeight()/2.0f) - y;
        double degree = Math.atan2(x, y)*180.0/PI;
        return degree;
    }
}
