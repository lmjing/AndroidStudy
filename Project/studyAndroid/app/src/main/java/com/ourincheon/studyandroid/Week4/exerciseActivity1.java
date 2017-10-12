package com.ourincheon.studyandroid.Week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ourincheon.studyandroid.R;

public class exerciseActivity1 extends AppCompatActivity {

    ImageView imageView1, imageView2;
    boolean bToggleImage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);

        imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
    }

    public void onButtonClicked(View view) {
        if (bToggleImage) {
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }else {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        }
        bToggleImage = !bToggleImage;
    }
}
