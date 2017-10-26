package com.ourincheon.studyandroid.Week7_Lab6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_MyView extends View {
    int x, y ;
    Paint paint;

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }

    //overrid , construct 자동 생성해주는 창 뜨는 단축키 command + N
    public day1026_MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);

        //현재 사용 중인 디스플레이 정보를 가져올 수 있음
        DisplayMetrics dm = getResources().getDisplayMetrics();
        float density = dm.density;
        x = dm.widthPixels / 2;
        y = dm.heightPixels / 2;

        //onDraw -> context로 위치 변경 -> 그려질때마다 객체 생성되는 것은 매우 비효율적
        paint = new Paint();
        // 붓의 색 등 속성 설정
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
    }

    //command + P : 필요한 파라미터의 정보 알려줌
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(x-50, y-150, x+50, y-50, paint);
    }


}
