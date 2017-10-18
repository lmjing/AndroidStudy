package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 18..
 */

public class day1018_event extends AppCompatActivity {

    // 4. xml에 onclick 메소드 정의하기
    // override 없음 & 비추하는 방법
    public void onClick2(View v) {
        Toast.makeText(getApplicationContext(), "버튼 눌렀어요", Toast.LENGTH_SHORT).show();
    }

    class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "버튼 눌렀어요", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1018_event1);

        Button button = (Button)findViewById(R.id.button);

//        1. 인스턴스 생성 후 삽입
//        MyListener lis = new MyListener();
//        button.setOnClickListener(lis);

//        1-2. 바로 객체 생성, 정의하기
//        button.setOnClickListener(new MyListener());

//        2. 한 번 밖에 쓰이지 않으므로 바로 listener 생성
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼 눌렸어요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
