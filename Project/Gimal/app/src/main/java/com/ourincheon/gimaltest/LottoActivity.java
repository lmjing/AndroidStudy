package com.ourincheon.gimaltest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mijeong on 2017. 12. 21..
 */

public class LottoActivity extends AppCompatActivity {

    static final String LOTTO_TAG = "<Lotto>";

    EditText editText;
    Button button1, button2, button3, button4, button5, button6;
    ArrayList<Button> buttonList = new ArrayList<Button>();
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    ArrayList<Integer> lottoNumber = new ArrayList<Integer>();
    int index = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotto_layout);

        init();
        makeLottoNumber();
    }

    private void makeLottoNumber() {
        String lottoNumStr = "";
        int lottoIndex = 0;
        while (lottoIndex < 6) {
            double randomNum = Math.random();
            int num = (int)(randomNum * 45) + 1;
            if (!lottoNumber.contains(num)) {
                lottoNumber.add(num);
                lottoIndex++;
                lottoNumStr += Integer.toString(num) + " ";
            }
        }
        Log.i(LOTTO_TAG, "생성된 로또 번호 : "+lottoNumStr);
    }

    private void init() {
        editText = (EditText)findViewById(R.id.editText);
        buttonList.add((Button)findViewById(R.id.button1));
        buttonList.add((Button)findViewById(R.id.button2));
        buttonList.add((Button)findViewById(R.id.button3));
        buttonList.add((Button)findViewById(R.id.button4));
        buttonList.add((Button)findViewById(R.id.button5));
        buttonList.add((Button)findViewById(R.id.button6));
//        button1 = (Button)findViewById(R.id.button1);
//        button2 = (Button)findViewById(R.id.button2);
//        button3 = (Button)findViewById(R.id.button3);
//        button4 = (Button)findViewById(R.id.button4);
//        button5 = (Button)findViewById(R.id.button5);
//        button6 = (Button)findViewById(R.id.button6);
    }

    public void inputNumber(View v) {
        String input = editText.getText().toString();
        buttonList.get(index).setText(input);
        numberList.add(Integer.parseInt(input));
        index++;
        editText.setText("");
    }

    public void lottoClicked(View v) {
//        if(numberList.isEmpty()) {
//            Toast.makeText(getApplicationContext(), "번호를 입력해주세요!", Toast.LENGTH_SHORT).show();
//            return;
//        }
        while (index < 6) {
            double randomNum = Math.random();
            int num = (int)(randomNum * 45) + 1;
            if (!numberList.contains(num)) {
                buttonList.get(index).setText(Integer.toString(num));
                numberList.add(num);
                index++;
            }
        }

        int score = 0;
        for(int num : numberList) {
            if(lottoNumber.contains(num)) score ++;
        }

        if(score == 6) {
            Toast.makeText(getApplicationContext(), "축하합니다. 1등 당첨입니다!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "아깝군요. 다음 기회에!", Toast.LENGTH_SHORT).show();
        }
    }
}
