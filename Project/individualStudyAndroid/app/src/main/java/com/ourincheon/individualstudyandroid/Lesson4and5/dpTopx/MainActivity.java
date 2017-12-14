package com.ourincheon.individualstudyandroid.Lesson4and5.dpTopx;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mijeong on 2017. 12. 14..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //32dp씩 지정하라.
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        ));
        int px = dpTopx(32);
        relativeLayout.setPadding(px, px, px, px);

        TextView textView = new TextView(this);
        textView.setText("textView 입니다.");

        relativeLayout.addView(textView);
        setContentView(relativeLayout);
    }

    private int dpTopx(int dp) {
        // soultion1
//        float scale = getResources().getDisplayMetrics().density;
//        return (int)(scale * dp + 0.5f);

        // soultion2
//        float scale = getResources().getDisplayMetrics().density;
//        return Math.round(scale * dp);

        // soultion3
//        float fx = dp * getResources().getDisplayMetrics().density;
//        return (int)fx;

        // soultion4
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }
}
