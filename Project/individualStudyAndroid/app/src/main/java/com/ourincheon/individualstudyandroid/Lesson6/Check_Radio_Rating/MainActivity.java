package com.ourincheon.individualstudyandroid.Lesson6.Check_Radio_Rating;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox_meat, checkBox_cheeze;
    String meat_status, cheeze_status;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6_check_radio_rating);

        //checkbox
        checkBox_meat = (CheckBox)findViewById(R.id.checkbox_meat);
        checkBox_cheeze = (CheckBox)findViewById(R.id.checkbox_cheeze);
        Button button_check = (Button)findViewById(R.id.button_check);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(meat_status + " and " + cheeze_status);
            }
        });

        //radio
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radio_red:
                        showToast("red가 눌렸군요");
                        break;
                    case R.id.radio_yellow:
                        showToast("yellow가 눌렸군요");
                        break;
                }
            }
        });

        //ratingbar
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                showToast("score : " + v);
            }
        });
    }

    public void onChecked(View v) {
        switch (v.getId()) {
            case R.id.checkbox_cheeze:
                cheeze_status = checkBox_cheeze.isChecked() ? "cheeze selected" : "cheeze unselected";
                showToast(cheeze_status);
                break;
            case R.id.checkbox_meat:
                meat_status = checkBox_meat.isChecked() ? "meat selected" : "meat unselected";
                showToast(meat_status);
                break;
        }
    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
