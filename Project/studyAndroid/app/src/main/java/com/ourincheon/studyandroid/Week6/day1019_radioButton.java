package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 19..
 */

public class day1019_radioButton extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1019_radiobutton);

        RadioButton red = (RadioButton)findViewById(R.id.radioButton);
        RadioButton blue = (RadioButton)findViewById(R.id.radioButton2);
        if (red.isChecked()) {
            Toast.makeText(getApplicationContext(),"빨강을 눌렀군요", Toast.LENGTH_SHORT).show();
        }else if (blue.isChecked()) {
            Toast.makeText(getApplicationContext(), "파랑을 눌렀군요", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButton(View v) {
        String str = ((RadioButton)v).getText().toString() + "이 눌렸군요.";
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
