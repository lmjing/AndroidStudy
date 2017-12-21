package com.ourincheon.individualstudyandroid.TestPrepare.WorldTime;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class CountryView extends LinearLayout {
    TextView nameTextView, timeTextView;

    public CountryView(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.prepare3_list_item, this, true);

        nameTextView = (TextView)findViewById(R.id.CountryTextView);
        timeTextView = (TextView)findViewById(R.id.timeTextView);
    }

    public CountryView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    public void setData(Country country) {
        nameTextView.setText(country.name);
        timeTextView.setText(country.time);
    }
}
