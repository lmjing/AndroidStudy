package com.ourincheon.individualstudyandroid.Lesson7.Lab1;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.Lesson7.Dialog.AlertDialog.MainAcitivty;
import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 12..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson7_lab1_main_activity);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.lesson7_lab1_login_dialog);
                dialog.setTitle("로그인");

                Button loginBtn = (Button)dialog.findViewById(R.id.loginButton);
                Button cancleBtn = (Button)dialog.findViewById(R.id.cancelButton);

                cancleBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                loginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText idEditText = (EditText)dialog.findViewById(R.id.idEditText);
                        EditText pwEditText = (EditText)dialog.findViewById(R.id.pwEditText);
                        String id = idEditText.getText().toString();
                        String pw = pwEditText.getText().toString();

                        if (id.length() <= 0)
                            showMessage("id를 입력해주세요.");
                        else if (pw.length() <= 0)
                            showMessage("비밀번호를 입력해주세요.");
                        else if (!id.equals("abcd"))
                            showMessage("id가 틀렸습니다.");
                        else if (!pw.equals("1111"))
                            showMessage("비밀번호가 틀렸습니다.");
                        else {
                            showMessage(id + "님 환영합니다.");
                            dialog.dismiss();
                        }
                    }
                });
                dialog.show();
            }
        });
    }

    void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
