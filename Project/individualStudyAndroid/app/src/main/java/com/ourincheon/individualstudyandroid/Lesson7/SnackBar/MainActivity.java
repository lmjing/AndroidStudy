package com.ourincheon.individualstudyandroid.Lesson7.SnackBar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 11..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_main_layout);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View context = findViewById(R.id.main_layout_id);
                String message = "SnackBar Message";
                int duration = Snackbar.LENGTH_SHORT;
                showSnackBar(context, message, duration);
            }
        });
    }

    void showSnackBar(View view, String message, int duration) {
        Snackbar.make(view, message, duration).show();
    }
}
