package com.ourincheon.individualstudyandroid.TestPrepare;

import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by mijeong on 2017. 12. 20..
 */

public class MainActivity extends AppCompatActivity {

    static final String TAG = "<CalTest>";

    EditText editText;
    String buff = "", output = "";
    ArrayList<Object> input = new ArrayList<Object>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prepare2_cal);

        editText = (EditText)findViewById(R.id.editText);
        Button clearBtn = (Button)findViewById(R.id.clearButton);
        Button resultBtn = (Button)findViewById(R.id.resultButton);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stack<Integer> numStack = new Stack<Integer>();
                Stack<String> operStack = new Stack<String>();
                boolean calFlag = false;

                //마지막 숫자 넣어줌
                if (buff.length() == 0) {
                    Toast.makeText(getApplicationContext(), "연산자 후 숫자 입력은 필수 입니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                int lastnum = Integer.parseInt(buff);
                input.add(lastnum);
                editText.setText(output);

                //한번 쭉 돌면서 계산
                for (Object o: input) {
                    Log.i(TAG, "o : " + o);
                    if (o instanceof Integer) {
                        int num = (int)o;
                        if (calFlag) {
                            int beforeNum = numStack.pop();
                            int result = cal(beforeNum, num, operStack.pop());
                            numStack.push(result);
                        }else {
                            numStack.push(num);
                            Log.i(TAG, "numStack " + numStack.lastElement() + "들어감");
                        }
                    }else if(o instanceof String) {
                        String oper = (String)o;
                        operStack.push(oper);
                        calFlag = getWeight(oper);
                    }else {
                        Toast.makeText(getApplicationContext(), "무언가 문제가 있습니다.", Toast.LENGTH_SHORT).show();
                    }
                }
                //우선순위 낮은 애들 마저 처리하기
                while(!operStack.isEmpty()) {
                    int num = numStack.pop();
                    int result = cal(numStack.pop(), num, operStack.pop());
                    numStack.push(result);
                }

                int result = numStack.pop();
                editText.setText(Integer.toString(result));
                buff = Integer.toString(result);
                output = Integer.toString(result);
                input.clear();
                input.add(result);
            }
        });
    }

    public void numClicked(View v) {
        String str = ((Button)v).getText().toString();
        if (v.equals("0")) {

        }
        buff += str;
        output += str;
        editText.setText(output);
    }

    public void operClicked(View v) {
        if (buff.length() > 0) {
            int num = Integer.parseInt(buff);
            String oper = ((Button)v).getText().toString();
            input.add(num);
            input.add(oper);

            buff = "";
            output += " " + oper + " ";
            editText.setText(output);
        }else {
            //숫자가 입력되지 않은 상태에서 연산자가 눌린 경우 아무일도 일어나지 않는다.
            Toast.makeText(getApplicationContext(), "숫자 입력 후 연산자를 눌러주세요.", Toast.LENGTH_SHORT).show();
        }
    }

    void clear() {
        buff = ""; output = "";
        input.clear();
        editText.setText(output);
    }

    boolean getWeight(String oper) {
        return (oper.equals("*") || oper.equals("/"))? true : false;
    }

    int cal(int a, int b, String oper) {
        switch (oper) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" :
                if(b > 0) return a / b;
                Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다. 자동으로 clear됩니다." ,Toast.LENGTH_SHORT).show();
                clear(); break;
            default:
                Toast.makeText(getApplicationContext(), "없는 연산자입니다. 자동으로 clear됩니다." ,Toast.LENGTH_SHORT).show();
                clear(); break;
        }
        return  0;
    }
}
