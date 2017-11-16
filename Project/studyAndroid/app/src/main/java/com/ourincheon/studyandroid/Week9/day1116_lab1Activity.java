package com.ourincheon.studyandroid.Week9;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 16..
 */

public class day1116_lab1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1116_lab1);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog loginDialog = new Dialog(day1116_lab1Activity.this);
                loginDialog.setContentView(R.layout.day1116_lab1_custom_dialog);
                loginDialog.show();

                final EditText username = (EditText)findViewById(R.id.editText);
                final EditText password = (EditText)findViewById(R.id.editText2);

                // NOTE: 위에도 id 가 button이다 여기서 button은 무엇을 참조할까? => loginDialog 필수로 작성해야 함.
                Button btnLogin = (Button)loginDialog.findViewById(R.id.button);
                Button btnCancle = (Button)loginDialog.findViewById(R.id.button2);

                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // trim : 공백 제거
                        String name = username.getText().toString().trim();
                        String pwd = password.getText().toString().trim();
                        if (name.length() == 0) {
                            showToast("아이디를 입력하세요");
                        }else if (pwd.length() == 0) {
                            showToast("비밀번호를 입력하세요");
                        }else if (pwd.equals("1111")) {
                            showToast("비밀번호가 틀렸습니다. 다시 비밀번호를 입력해주세요");
                        }else {
                            showToast(name + "님, 어서 오세요");
                            loginDialog.dismiss();
                        }
                    }
                });

                btnCancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // NOTE: finish -> 어플리케이션을 꺼버리는 것 ( 차이 알아두기 )
                        loginDialog.dismiss();
                    }
                });
            }
        });
    }

    public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
