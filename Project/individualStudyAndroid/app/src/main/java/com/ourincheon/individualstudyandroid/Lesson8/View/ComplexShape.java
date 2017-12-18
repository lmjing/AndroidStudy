package com.ourincheon.individualstudyandroid.Lesson8.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class ComplexShape extends View {
    public ComplexShape(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        RectF r1 = new RectF(0, 0, 100, 100);
        RectF r2 = new RectF(200, 20, 300, 120);
        RectF r3 = new RectF(20, 140, 120, 240);
        RectF r4 = new RectF(20, 260, 120, 360);

        paint.setColor(Color.YELLOW);
        canvas.drawRoundRect(r1, 20, 20, paint);
    }
}
