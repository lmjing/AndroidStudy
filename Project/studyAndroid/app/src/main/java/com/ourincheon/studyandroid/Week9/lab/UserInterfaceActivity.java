package com.ourincheon.studyandroid.Week9.lab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 16..
 */

public class UserInterfaceActivity extends AppCompatActivity {
    RadioButton wonBtn, dollarBtn;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1116_lab4);

        wonBtn = (RadioButton)findViewById(R.id.wonBtn);
        dollarBtn = (RadioButton)findViewById(R.id.dollarBtn);
        editText = (EditText)findViewById(R.id.editText);

        Button convertBtn = (Button)findViewById(R.id.button);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                if (s.length() > 0) {
                    float value = Float.parseFloat(s);
                    if (wonBtn.isChecked()) {
                        convertWonToDollar(value);
                    }else if(dollarBtn.isChecked()) {
                        convertDollarToWon(value);
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "정확한 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button cButton = (Button)findViewById(R.id.button_clear);
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

    }

    private void convertWonToDollar(float won) {
        double dollar = won / 1105.60;
        editText.setText("원화 : " + won + "원 --> 달러 : " + String.format("%.2f", dollar) + "$");
        //US 달러(미국)
    }

    private void convertDollarToWon(float dollar) {
        double won = dollar * 1105.60;
        editText.setText("달러 : " + dollar + "$ --> 원화 : " + String.format("%.2f", won) + "원");
    }
}
