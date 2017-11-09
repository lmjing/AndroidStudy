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

public class day1109_DialogActivity2 extends AppCompatActivity {
    //v1
//    CharSequence[] items = {"빨강", "파랑", "노랑"};

    //v2
    private int mSelect = 0;
    String[] items = getResources().getStringArray(R.array.colors);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1109_dialog);

        Button b = (Button)findViewById(R.id.call);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                final CharSequence[] items = {"빨강", "파랑", "노랑"};
                new AlertDialog.Builder(day1109_DialogActivity2.this)
                        .setTitle("게시판")
                        .setMessage("오늘 출석 부름")
                        .setIcon(R.mipmap.ic_launcher)
                        //v1
//                        .setItems(items,
//                                new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//                                        Toast.makeText(getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
//                                    }
//                                })
                        //v2
                        .setSingleChoiceItems(items, mSelect,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        mSelect = i;
                                    }
                                })
                        .setPositiveButton("Select",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(),
                                                items[mSelect] + " seleted",Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNegativeButton("Cancel", null)
                        .show();
            }
        });
    }
}
