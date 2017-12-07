package com.ourincheon.studyandroid.Week12.Lab9;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mijeong on 2017. 12. 7..
 */

public class day1207_ListView3 extends AppCompatActivity {
    String[] values = {"Apple", "Appricot", "Avocado", "Banana", "Blackberry",
            "Blueberry", "Cherry", "Coconut", "Cranberry",
            "Grape Raisin", "Honeydew", "Jackfruit", "Lemon","Lime",
            "Mango", "Watermelon"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1207_listview);

        ArrayList<day1207_FruitItem> fruit_list = new ArrayList<day1207_FruitItem>();
        day1207_FruitItem f1 = new day1207_FruitItem("apple", R.drawable.apple);
        fruit_list.add(f1);
        fruit_list.add(new day1207_FruitItem("apple", R.drawable.apple));
        fruit_list.add(new day1207_FruitItem("banana", R.drawable.banana));
        fruit_list.add(new day1207_FruitItem("grape", R.drawable.grape));
        fruit_list.add(new day1207_FruitItem("orange", R.drawable.orange));
        fruit_list.add(new day1207_FruitItem("papaya", R.drawable.papaya));
        fruit_list.add(new day1207_FruitItem("pineapple", R.drawable.pineapple));
        fruit_list.add(new day1207_FruitItem("strawberry", R.drawable.strawberry));
        fruit_list.add(new day1207_FruitItem("watermelon", R.drawable.watermelon));

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new FruitAdapter(this, R.layout.day1207_fruit_item, fruit_list));
    }

    class FruitAdapter extends ArrayAdapter<day1207_FruitItem> {
        ArrayList<day1207_FruitItem> item_list;

        public FruitAdapter(Context context, int resId, ArrayList<day1207_FruitItem> items) {
            super(context, resId, items);
            this.item_list = items;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            /*
            1번째 방법 View 객체를 따로 정의해서 가져오는 방식 -> fruitItemView
            2번째 방법 여기서 바로 View를 불러와 정의하는 방식 -> linearLayout
             */
//            day1207_FruitItemView fruitItemView;
            LinearLayout linearLayout;

            if(view == null) {
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                linearLayout = (LinearLayout)inflater.inflate(R.layout.day1207_fruit_item, viewGroup, false);
//                fruitItemView = new day1207_FruitItemView(getApplicationContext());
            }else {
                linearLayout = (LinearLayout)view;
//                fruitItemView = (day1207_FruitItemView)view;
            }

            day1207_FruitItem item = item_list.get(i);

            TextView textView = (TextView)linearLayout.findViewById(R.id.textView);
            ImageView imageView = (ImageView)linearLayout.findViewById(R.id.imageView);
            textView.setText(item.getName());
            imageView.setImageResource(item.getResId());

//            fruitItemView.setName(item.getName());
//            fruitItemView.setImage(item.getResId());

//            return fruitItemView;
            return linearLayout;
        }
    }
}
