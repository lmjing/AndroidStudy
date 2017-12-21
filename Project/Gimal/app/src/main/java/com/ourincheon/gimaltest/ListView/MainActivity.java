package com.ourincheon.gimaltest.ListView;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.ourincheon.gimaltest.R;

import java.util.ArrayList;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CountryAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity_main);

        listView = (ListView)findViewById(R.id.listView);

        adapter = new CountryAdapter();
        setData();

//        listView.setAdapter(new CountryAdapter2(this, R.layout.country_list_item, adapter.countries));
        listView.setAdapter(adapter);
    }

    public void setData() {
        adapter.addItem(new Country("중국", "베이징", 1403500365, R.drawable.flag1));
        adapter.addItem(new Country("인도", "뉴델리", 1324171354, R.drawable.flag1));
        adapter.addItem(new Country("미국", "워싱턴D.C.", 326474013, R.drawable.flag3));
        adapter.addItem(new Country("인도네시아", "자카르타", 263510146, R.drawable.flag1));
        adapter.addItem(new Country("브라질", "브라질리아", 211168002, R.drawable.flag4));
        adapter.addItem(new Country("파키스탄", "이슬라마바드", 200545813, R.drawable.flag1));
        adapter.addItem(new Country("나이지리아", "아부자", 191577598, R.drawable.flag3));
        adapter.addItem(new Country("방글라데시", "다카", 174738243, R.drawable.flag1));
        adapter.addItem(new Country("러시아", "모스크바", 143377656, R.drawable.flag4));
        adapter.addItem(new Country("멕시코", "멕시코시티", 130148109, R.drawable.flag2));
        adapter.addItem(new Country("일본", "도쿄", 126056362, R.drawable.flag2));
        adapter.addItem(new Country("필리핀", "마닐라", 104213827, R.drawable.flag2));
        adapter.addItem(new Country("에티오피아", "아디스아바바", 103722194, R.drawable.flag2));
        adapter.addItem(new Country("베트남", "하노이", 95261021, R.drawable.flag2));
        adapter.addItem(new Country("이집트", "카이로", 82801633, R.drawable.flag2));
        adapter.addItem(new Country("이란", "테헤란", 81331050, R.drawable.flag4));
        adapter.addItem(new Country("콩고 민주공화국", "킨샤샤", 80722792, R.drawable.flag1));
        adapter.addItem(new Country("독일", "베를린", 80274604, R.drawable.flag3));
        adapter.addItem(new Country("터키", "앙카라", 68200824, R.drawable.flag1));
        adapter.addItem(new Country("태국", "방콕", 1403500365, R.drawable.flag4));
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

            if (convertView == null) {
                view = new CountryView(getApplicationContext());
            }else {
                view = (CountryView)convertView;
            }

            Country country = countries.get(i);
            view.setData(country);

            return view;
        }
    }

    public class CountryAdapter2 extends ArrayAdapter<Country> {
        ArrayList<Country> countries = new ArrayList<Country>();

        public CountryAdapter2(@NonNull Context context, @LayoutRes int resource, ArrayList<Country> countries) {
            super(context, resource);
            this.countries = countries;
        }

        @Override
        public Country getItem(int position) {
            return countries.get(position);
        }

        @Override
        public int getCount() {
            return countries.size();
        }

        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            CountryView view;

            if (convertView == null) {
                view = new CountryView(getApplicationContext());
            }else {
                view = (CountryView)convertView;
            }

            view.setData(getItem(position));

            return view;
        }
    }
}
