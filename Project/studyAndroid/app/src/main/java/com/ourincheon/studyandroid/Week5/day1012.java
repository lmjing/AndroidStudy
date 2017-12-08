package com.ourincheon.studyandroid.Week5;

import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 12..
 */

public class day1012 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);

        RelativeLayout myLayout = new RelativeLayout(this);

        TextView myText = new TextView(this);
        myText.setText("Hello, Android");
        myText.setBackgroundColor(Color.YELLOW);
//        int dp = 16;
//        float scale = getResources().getDisplayMetrics().density;
//
//        int px = (int) Math.round(scale * dp);


//        int px = getResources().getDimensionPixelOffset(R.dimen.textView_padding);
        int px = (int)getResources().getDimension(R.dimen.textView_padding);
        myText.setPadding(px, px, px, px);

        Log.d("unit convert", "px : " + px);

        myLayout.addView(myText);
        setContentView(myLayout);
    }
}
