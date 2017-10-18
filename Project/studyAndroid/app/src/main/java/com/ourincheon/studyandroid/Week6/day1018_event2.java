package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;
import com.ourincheon.studyandroid.Week4.MainActivity;

/**
 * Created by mijeong on 2017. 10. 18..
 */

public class day1018_event2 extends AppCompatActivity implements View.OnClickListener {

    // 3. implements 하여 구현
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "버튼 눌렸어요", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1018_event1);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(day1018_event2.this);
    }
}
