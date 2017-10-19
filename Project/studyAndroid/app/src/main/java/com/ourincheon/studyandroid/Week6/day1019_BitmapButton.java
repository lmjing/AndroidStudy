package com.ourincheon.studyandroid.Week6;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.ourincheon.studyandroid.R;

// superClass가 Button이 아닌 이유 : 최신 버전과만 호환되므로 AppCompat 사용
/**
 * Created by mijeong on 2017. 10. 19..
 */

public class day1019_BitmapButton extends AppCompatButton {
    // 필수
    public day1019_BitmapButton(Context context) {
        super(context);
        setBackgroundResource(R.drawable.bitmap_button_normal);
    }

    public day1019_BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.bitmap_button_normal);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                setBackgroundResource(R.drawable.bitmap_button_normal); break;
            case MotionEvent.ACTION_DOWN:
                setBackgroundResource(R.drawable.bitmap_button_clicked); break;
            default:
                setBackgroundResource(R.drawable.bitmap_button_normal); break;
        }
        invalidate();
        return super.onTouchEvent(event);
    }
}
