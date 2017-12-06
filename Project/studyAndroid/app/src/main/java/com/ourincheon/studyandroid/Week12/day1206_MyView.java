package com.ourincheon.studyandroid.Week12;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/**
 * Created by mijeong on 2017. 12. 6..
 */

public class day1206_MyView extends View {
    float mx = 100;

    public day1206_MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //시작 값과 끝 값을 지정
            ValueAnimator valueAnim = ValueAnimator.ofFloat(100, getWidth()-100);
            //AccelerateDecelerateInterpolator : 점점 빨라지게 해줘(가속)
            valueAnim.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnim.setDuration(3000);
            valueAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    // 얘가 호출 될 때마다 변화된 x값을 알려줌
                    // 소문자 float : 타입 / Float : 객체 (여기선 객체 써야함)
                    mx = (Float)valueAnimator.getAnimatedValue();
                    invalidate();
                }
            });
            valueAnim.start();
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawCircle(mx, 500, 100, paint);
    }
}
