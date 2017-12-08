package com.ourincheon.studyandroid.Week12.HomeWork5;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.ourincheon.studyandroid.R;

import java.util.Random;

/**
 * Created by mijeong on 2017. 12. 8..
 */

public class MainActivity extends AppCompatActivity {
    ImageView iv_roulette;
    float startDegree = 0f;
    float endDegree = 0f;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_roulette = (ImageView)findViewById(R.id.roulette);

//        ObjectAnimator object = ObjectAnimator.ofFloat(iv_roulette,
//                "rotation", 0.0f, 405.0f);
//        object.setInterpolator(new AccelerateDecelerateInterpolator());
//        object.setDuration(3000);
//        object.start();
    }

    public void rotate(View v) {
        startDegree = endDegree;
        int degree_min = 720;
        Random rand = new Random();
        int degree_rand = rand.nextInt(360);
        endDegree = startDegree + degree_min + degree_rand;

        RotateAnimation rotate = new RotateAnimation(
                startDegree, endDegree,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setInterpolator(new AccelerateDecelerateInterpolator());
        rotate.setDuration(5000);
        rotate.setFillAfter(true);
        iv_roulette.startAnimation(rotate);
    }
}
