package com.ourincheon.studyandroid.Week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MakeLinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_layout);

        // context = 화면 = UI = Activity
        LinearLayout lin = new LinearLayout(this); // this = MakeLinearActivity.this

        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        lin.setLayoutParams(lparams);
        lin.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(this);
        Button b2 = new Button(this);
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        b1.setLayoutParams(btnParams);
        b2.setLayoutParams(btnParams);
        b1.setText("Button");
        b2.setText("Button 2");
//        b1.setId(View.generateViewId());
//        b2.setId(View.generateViewId());

        lin.addView(b1);
        lin.addView(b2);
        setContentView(lin);
    }
}
