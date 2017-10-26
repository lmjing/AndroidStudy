package com.ourincheon.studyandroid.Week7_Lab6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_MyPath extends View {
    Paint paint;
    Path mPath;

    public day1026_MyPath(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10f);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);

        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mPath.moveTo(x, y); return true;
            case MotionEvent.ACTION_MOVE:
                mPath.lineTo(x, y); break;
            case MotionEvent.ACTION_UP:
                break;
            default: return false;
        }

        //view를 상속받았기 때문에 인스턴스에서 접근하지 않아도 된다.
        invalidate();
        return true;
    }
}
