package com.ourincheon.gimaltest.ListView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ourincheon.gimaltest.R;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class CountryView extends GridLayout {
    TextView nameTV, populationTV, capitalTV;
    ImageView imageView;

    public CountryView(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.country_list_item, this, true);

        nameTV = (TextView)findViewById(R.id.NameTextView);
        populationTV = (TextView)findViewById(R.id.populationTextView);
        capitalTV = (TextView)findViewById(R.id.capitalTextView);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public CountryView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setData(Country country) {
        nameTV.setText(country.name);
        capitalTV.setText(country.capital);
        imageView.setImageResource(country.imageID);
        populationTV.setText(String.format("%,d명", country.population));
    }
}
