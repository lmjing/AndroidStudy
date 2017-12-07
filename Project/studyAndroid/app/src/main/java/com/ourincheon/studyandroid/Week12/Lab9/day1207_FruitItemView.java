package com.ourincheon.studyandroid.Week12.Lab9;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 7..
 */

public class day1207_FruitItemView extends LinearLayout {
    TextView textView;
    ImageView imageView;

    public day1207_FruitItemView(Context context) {
        super(context);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.day1207_fruit_item, this, true);

        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void setName(String name) {
        textView.setText(name);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
