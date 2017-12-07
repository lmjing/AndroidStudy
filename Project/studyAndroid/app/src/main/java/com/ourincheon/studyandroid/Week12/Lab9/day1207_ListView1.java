package com.ourincheon.studyandroid.Week12.Lab9;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 7..
 */

public class day1207_ListView1 extends AppCompatActivity {
    String[] values = {"Apple", "Appricot", "Avocado", "Banana", "Blackberry",
            "Blueberry", "Cherry", "Coconut", "Cranberry",
            "Grape Raisin", "Honeydew", "Jackfruit", "Lemon","Lime",
            "Mango", "Watermelon"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1207_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);

//        ArrayAdapter<CharSequence> adapter;
//        adapter = ArrayAdapter.createFromResource(this, R.array.fruits, android.R.layout.simple_list_item_1);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // 데이터 원본에 바로 접근하는 것은 좋지 않으므로 위의 방법을 사용할 것
//                String msg = "선택한 항목은 " + adapterView.getAdapter().getItem(i);
                String msg = "선택한 항목은 " + values[i];
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
