package com.ourincheon.myapplication234;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mijeong on 2017. 10. 11..
 */

public class MakeRelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myLayout = new RelativeLayout(this);

        TextView myText = new TextView(this);
        myText.setText("Hello, android");
        myText.setBackgroundColor(Color.YELLOW);

        // dp를 px값으로 변환시킴
        int dp = 16;
        float scale = getResources().getDisplayMetrics().density;
        int px = (int)(scale * dp + 0.5);
        myText.setPadding(px, px, px, px);

        Log.i("unit convert", "dp = " + dp);
        Log.i("unit convert", "px = " + px);

        RelativeLayout.LayoutParams myTextParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        myTextParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        myTextParams.addRule(RelativeLayout.CENTER_VERTICAL);
        myText.setLayoutParams(myTextParams);
        myLayout.addView(myText);
        setContentView(myLayout);
    }
}
