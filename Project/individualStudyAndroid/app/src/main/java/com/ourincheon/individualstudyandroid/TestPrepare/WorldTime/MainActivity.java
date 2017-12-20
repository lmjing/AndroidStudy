package com.ourincheon.individualstudyandroid.TestPrepare.WorldTime;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.ourincheon.individualstudyandroid.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.Inflater;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CountryAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prepare3_main_activity);

        listView = (ListView)findViewById(R.id.listView);

        adapter = new CountryAdapter();
        adapter.addItem(makeCountry("Asia/Seoul"));
        adapter.addItem(makeCountry("JST"));
        adapter.addItem(makeCountry("America/Los_Angeles"));
        adapter.addItem(makeCountry("America/New_York"));

        listView.setAdapter(adapter);
    }

    public Country makeCountry(String timeZone) {
        TimeZone time;
        Date date = new Date();
        DateFormat df = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss (z Z)");

        time = TimeZone.getTimeZone(timeZone);
        df.setTimeZone(time);

        System.out.format("%s%n%s%n%n", time.getDisplayName(),
                df.format(date));

        return new Country(timeZone, df.format(date));
    }

    public class CountryAdapter extends BaseAdapter {
        ArrayList<Country> countries = new ArrayList<Country>();

        public void addItem(Country country) {
            countries.add(country);
        }

        @Override
        public int getCount() {
            return countries.size();
        }

        @Override
        public Object getItem(int i) {
            return countries.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            CountryView view;

            if(convertView == null) {
                view = new CountryView(getApplicationContext());
            }else {
                view = (CountryView)convertView;
            }
            Country country = countries.get(i);
            view.setData(country);

            return view;
        }
    }

}
