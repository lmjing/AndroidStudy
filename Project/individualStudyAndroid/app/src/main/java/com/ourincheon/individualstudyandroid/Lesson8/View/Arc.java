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

public class Arc extends View {

    public Arc(Context context) {
        super(context);
        setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float width = (int)canvas.getWidth();
        float height = (int)canvas.getHeight();
        float center_x = width/2, center_y;
        float radius = width/4;

        Paint paint = new Paint();
        RectF oval = new RectF();

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        center_y = height/4;
        oval.set(center_x - radius, center_y - radius, center_x + radius, center_y + radius);
        canvas.drawArc(oval, 90, 270, true, paint);

        paint.setStyle(Paint.Style.STROKE);
        center_y = height/2;
        oval.set(center_x - radius, center_y - radius, center_x + radius, center_y + radius);
        canvas.drawArc(oval, 90, 270, true, paint);

        center_y = height * 3/4;
        oval.set(center_x - radius, center_y - radius, center_x + radius, center_y + radius);
        canvas.drawArc(oval, 90, 270, false, paint);
    }
}
