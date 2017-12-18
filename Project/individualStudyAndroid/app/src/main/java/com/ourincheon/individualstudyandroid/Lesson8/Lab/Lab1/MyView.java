package com.ourincheon.individualstudyandroid.Lesson8.Lab.Lab1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by mijeong on 2017. 12. 19..
 */

public class MyView extends View {
    Paint mPaints, mFramePaint;
    RectF mBigOval;
    float mStart, mSweep;

    private static final float SWEEP_INC = 2;
    private static final float START_INC = 15;

    public MyView(Context context) {
        super(context);

        mPaints = new Paint();
        mPaints.setStyle(Paint.Style.FILL);
        mPaints.setColor(0x88ff0000);

        mFramePaint = new Paint();
        mFramePaint.setStyle(Paint.Style.STROKE);
        mFramePaint.setStrokeWidth(3);
        mFramePaint.setColor(0x8800ff00);

        mBigOval = new RectF(40, 10, 280, 240);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.YELLOW);
        canvas.drawRect(mBigOval, mFramePaint);
        canvas.drawArc(mBigOval, mStart, mSweep, false, mPaints);
        mSweep += SWEEP_INC;
        if (mSweep > 360) {
            mSweep -= 360;
            mStart += START_INC;
            if (mStart >= 360) {
                mStart -= 360;
            }
        }
        invalidate();
    }
}
