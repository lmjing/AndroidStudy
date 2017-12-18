package com.ourincheon.individualstudyandroid.Lesson6.ButtonListener;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends AppCompatActivity
    //방법3 - 인터페이스를 Activity 클래스에 직접 구현
//implements View.OnClickListener
{

    //방법3 - 인터페이스를 Activity 클래스에 직접 구현
//    @Override
//    public void onClick(View view) {
//        Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
//    }

    // 방법1 - 내부 클래스 정의
    class MyListenerClass implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6_button_listener);

        Button button = (Button)findViewById(R.id.button);

        // 방법1 - 내부 클래스 정의
//        MyListenerClass listener = new MyListenerClass();
//        button.setOnClickListener(listener);

        // 방법2 - 무명 클래스 (인터페이스를 구현하는 내부 클래스를 구현하지 않음)
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    //방법4 - xml, 간단하게 구현하는 방법
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }
}
