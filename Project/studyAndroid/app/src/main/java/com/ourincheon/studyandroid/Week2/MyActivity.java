package com.ourincheon.studyandroid.Week2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //생성한 xml을 객체화시켜 메모리에 할당(참조) ( == 인플레이션 한다. )
        setContentView(R.layout.activity_my);

        TextView tv = (TextView)findViewById(R.id.myTextView);
        String str = getString(R.string.my_msg);
        tv.setText(str); // android:text = " ... "과 동일
    }
}
