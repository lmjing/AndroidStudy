package com.ourincheon.studyandroid.Week10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by mijeong on 2017. 11. 22..
 */

public class day1122_graphic_View1 extends View {

    public day1122_graphic_View1(Context context) {
        super(context);
        //여기서 설정하는게 가장 일반적인 방법
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //자주 사용하니깐 paint 객체 만들어 놓고
        Paint paint = new Paint();
        // 기출 문제 가능성
        paint.setStrokeWidth(30);
        paint.setColor(Color.BLUE);
        canvas.drawLine(100, 100, 400, 100, paint);
        canvas.drawRect(20, 110, 350, 250, paint);
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(200, 450, 100, paint);
        paint.setTextSize(50);

        canvas.drawText("텍스트도 그릴 수 있습니다.", 20, 700, paint);

        paint.setColor(Color.RED);
        canvas.drawLine(100, 100, 100, 400, paint);
    }
}
