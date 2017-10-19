package com.ourincheon.studyandroid.Week6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 10. 19..
 */

public class day1019_checkBox extends AppCompatActivity {
    String status_meat = "고기 취소", status_cheese = "치즈 취소";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1019_checkbox);
    }

    public void onCheckBox(View v) {
        boolean flag = ((CheckBox)v).isChecked();

        switch (v.getId()) {
            case R.id.checkBox:
                status_meat = flag ? "고기 선택" : "고기 취소";
                break;
            case R.id.checkBox2:
                status_cheese = flag ? "치즈 선택" : "치즈 취소";
                break;
        }
    }

    public void onButtonClick(View v) {

        String str = status_meat + ", " + status_cheese;
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
