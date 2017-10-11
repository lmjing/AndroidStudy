package com.ourincheon.myapplication234;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        //findViewById로 찾기만 하면 어떤 ViewType인지 알 수 없기 때문에, 항상 형변환을 시켜주어야 함
        Button b1 = (Button)findViewById(R.id.button);
        Button b2 = (Button)findViewById(R.id.button2);
        b1.setText("버튼");
    }
}
