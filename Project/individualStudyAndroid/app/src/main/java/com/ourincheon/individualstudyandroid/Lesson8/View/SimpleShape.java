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

public class SimpleShape extends View {

    public SimpleShape(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);

        canvas.drawLine(20, 50, 350, 50, paint);
        canvas.drawRect(20, 100, 350, 250, paint);
        canvas.drawCircle(200, 450, 100, paint);
        paint.setTextSize(50);
        canvas.drawText("텍스트도 그릴 수 있습니다.", 20, 700, paint);
    }
}
