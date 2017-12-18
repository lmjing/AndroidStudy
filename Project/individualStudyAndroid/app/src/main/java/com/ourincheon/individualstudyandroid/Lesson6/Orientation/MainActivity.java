package com.ourincheon.individualstudyandroid.Lesson6.Orientation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends AppCompatActivity {
    static final String TAG = "<Orientation>";

    EditText editText;
    TextView textView;
    Button button;
    String s;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6_orientation);

        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = editText.getText().toString();
                textView.setText(s);
            }
        });

        if(savedInstanceState != null) {
            textView.setText("복원된 값 : " + savedInstanceState.getString("message"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("message", s);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop 호출됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestory 호출됨");
    }
}
