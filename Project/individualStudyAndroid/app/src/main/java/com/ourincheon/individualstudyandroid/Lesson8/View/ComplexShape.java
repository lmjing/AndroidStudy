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
        setBackgroundColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        RectF r1 = new RectF(10, 10, 110, 110);
        RectF r2 = new RectF(150, 10, 250, 110);
        RectF r3 = new RectF(10, 140, 120, 240);

        paint.setColor(Color.YELLOW);
        canvas.drawRoundRect(r1, 5, 5, paint);
        canvas.drawOval(r2, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(r3, 120, 270, true, paint);

        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(10);
        float[] pts = {10,250, 100,270, 100,270, 10,290, 10,290, 110, 310};
        canvas.drawLines(pts, paint);
    }
}
