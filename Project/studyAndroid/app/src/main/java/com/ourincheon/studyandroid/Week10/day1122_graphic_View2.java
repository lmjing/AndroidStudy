package com.ourincheon.studyandroid.Week10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by mijeong on 2017. 11. 22..
 */

public class day1122_graphic_View2 extends View {

    public day1122_graphic_View2(Context context) {
        super(context);
        setBackgroundColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        RectF r1 = new RectF(10, 10, 110, 110);
        RectF r2 = new RectF(150, 10, 250, 100);
        RectF r3 = new RectF(10, 120, 110, 220);
        RectF r4 = new RectF(10, 120, 110, 220);
        paint.setColor(Color.YELLOW);

        canvas.drawRoundRect(r1, 5, 5, paint);
        canvas.drawOval(r2, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(r3, 120, 270, true, paint);

        paint.setColor(Color.YELLOW);
        float[] pts = {10, 250, 100, 270, 100, 270, 20, 290, 20, 290, 120, 300};
        paint.setStrokeWidth(10);
        canvas.drawLines(pts, paint);

    }
}
