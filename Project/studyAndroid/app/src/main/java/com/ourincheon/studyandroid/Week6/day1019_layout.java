package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 19..
 */

public class day1019_layout extends AppCompatActivity {
    static final String TAG = "<Orientation>";

    TextView textView;
    EditText editText;

    String str;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1019_layout);
        Log.i(TAG,"onCreate() 메소드 호출");

        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = editText.getText().toString();
                textView.setText(str);
            }
        });

        if (savedInstanceState != null) {
            String s = savedInstanceState.getString("MY_KEY");
            textView.setText("복원된 값 : " + s);
        }else {
            textView.setText("복원된 값이 없습니다.");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart() 메소드 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume() 메소드 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop() 메소드 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy() 메소드 호출");
    }

    /*
        화면 가로<->세로 전환될 때 호출됨, 어플이 꺼질때는 호출 X
        화면 가로<->세로 전환될 때 onCreate가 다시 호출되고 여기서 저장해놓은 인자가 onCrate에 적용됨.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState() 메소드 호출");

        outState.putString("MY_KEY", str);
    }
}