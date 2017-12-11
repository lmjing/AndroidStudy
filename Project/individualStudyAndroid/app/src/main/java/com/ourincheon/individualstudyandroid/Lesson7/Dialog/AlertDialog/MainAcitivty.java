package com.ourincheon.individualstudyandroid.Lesson7.Dialog.AlertDialog;

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
    }
}
