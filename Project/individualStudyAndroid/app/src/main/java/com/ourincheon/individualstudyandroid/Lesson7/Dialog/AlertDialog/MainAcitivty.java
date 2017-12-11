package com.ourincheon.individualstudyandroid.Lesson7.Dialog.AlertDialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 9..
 */

public class MainAcitivty extends AppCompatActivity {

    static final int DIALOG_YES_NO_MESSAGE = 1;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertdialog_main_activity);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainAcitivty.this);
//                dialog.setIcon(R.mipmap.ic_launcher);
//                dialog.setTitle("Message Board");
//                dialog.setMessage("Open the dialog");
//                dialog.show();

                new AlertDialog.Builder(MainAcitivty.this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Message Board")
                        .setMessage("Open the dialog")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "operation is cancelled", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("CANCLE", null)
                        .show();
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog(DIALOG_YES_NO_MESSAGE).show();
            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                final CharSequence[] items = {"RED", "GREEN", "BLUE"};
                final String[] items = getResources().getStringArray(R.array.colors);
                new AlertDialog.Builder(MainAcitivty.this)
                        .setTitle("Choose the color below")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), items[i] + " selected", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .show();
            }
        });
    }

    Dialog createDialog(int id) {
        switch (id) {
            case DIALOG_YES_NO_MESSAGE:
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Simple Question")
                        .setMessage("Are you sure that you want to quit?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                Dialog dialog = builder.create();
                return dialog;
        }
        return null;
    }
}
