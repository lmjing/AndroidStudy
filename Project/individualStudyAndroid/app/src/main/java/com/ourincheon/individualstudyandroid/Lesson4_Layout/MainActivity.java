package com.ourincheon.individualstudyandroid.Lesson4_Layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by mijeong on 2017. 12. 14..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        ));

        Button oneBtn = new Button(this);
        oneBtn.setId(View.generateViewId());
        oneBtn.setText("첫번째 버튼");

        Button twoBtn = new Button(this);
        twoBtn.setId(View.generateViewId());
        twoBtn.setText("두번째 버튼");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );

        linearLayout.addView(oneBtn, params);
        linearLayout.addView(twoBtn, params);

        setContentView(linearLayout);
    }
}
