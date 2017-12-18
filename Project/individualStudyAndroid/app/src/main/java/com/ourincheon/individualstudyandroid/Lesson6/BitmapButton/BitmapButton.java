package com.ourincheon.individualstudyandroid.Lesson6.BitmapButton;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class BitmapButton extends AppCompatButton {

    public BitmapButton(Context context) {
        super(context);
        setBackgroundResource(R.drawable.bitmap_button_normal);
    }

    public BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.bitmap_button_normal);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                setBackgroundResource(R.drawable.bitmap_button_clicked); break;
            case MotionEvent.ACTION_UP:
                setBackgroundResource(R.drawable.bitmap_button_normal); break;
            default:
                setBackgroundResource(R.drawable.bitmap_button_normal); break;
        }
        invalidate();
        return super.onTouchEvent(event);
    }
}
