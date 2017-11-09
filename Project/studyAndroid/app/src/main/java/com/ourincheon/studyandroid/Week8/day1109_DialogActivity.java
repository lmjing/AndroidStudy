package com.ourincheon.studyandroid.Week8;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 9..
 */

public class day1109_DialogActivity extends AppCompatActivity {

    static final int YES_NO_DIALOG = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1109_dialog);

        Button b = (Button)findViewById(R.id.call);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(YES_NO_DIALOG).show();

//                new AlertDialog.Builder(day1109_DialogActivity.this)
//                        .setTitle("게시판")
//                        .setMessage("오늘 출석 부름")
//                        .setIcon(R.mipmap.ic_launcher)
//                        .setPositiveButton("예",
//                                new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//                                        finish();
//                                    }
//                                })
//                        .setNegativeButton("아니오",
//                                new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//                                        Toast.makeText(getApplicationContext(), "취소했군요", Toast.LENGTH_SHORT).show();
//                                    }
//                                })
//                        .setNeutralButton("취소", null)
//                        .show();

//                AlertDialog.Builder bld = new AlertDialog.Builder(day1109_DialogActivity.this);
//                bld.setTitle("게시판");
//                bld.setMessage("오늘 출석 부름");
//                bld.setIcon(R.mipmap.ic_launcher);
//                bld.show();
            }
        });
    }

    protected Dialog createDialog(int id) {
        Dialog dialog = null;

        switch (id) {
            case YES_NO_DIALOG:
                AlertDialog.Builder bld = new AlertDialog.Builder(day1109_DialogActivity.this);
                bld.setTitle("게시판")
                        .setMessage("오늘 출석 부름")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("예",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        finish();
                                    }
                                })
                        .setNegativeButton("아니오",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "취소했군요", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNeutralButton("취소", null);

                dialog = bld.create();
        }

        return dialog;
    }
}
