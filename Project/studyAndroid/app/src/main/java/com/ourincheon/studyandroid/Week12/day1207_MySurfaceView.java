package com.ourincheon.studyandroid.Week12;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 7..
 */

public class day1207_MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    SurfaceHolder mHolder;

    public day1207_MySurfaceView(Context context) {
        super(context);
        mHolder = getHolder();
        mHolder.addCallback(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        Bitmap b = BitmapFactory.decodeResource(
//                getResources(), R.drawable.harubang
//        );
//        canvas.drawColor(Color.YELLOW);
//        canvas.drawBitmap(b, 10, 10, null);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas c = null;

        try {
            c = mHolder.lockCanvas(null);
            synchronized (mHolder) {
                Bitmap b = BitmapFactory.decodeResource(
                        getResources(), R.drawable.harubang
                );
                c.drawColor(Color.YELLOW);
                c.drawBitmap(b, 10, 10, null);
            }
        }finally {
            if (c != null) {
                mHolder.unlockCanvasAndPost(c);
            }
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
