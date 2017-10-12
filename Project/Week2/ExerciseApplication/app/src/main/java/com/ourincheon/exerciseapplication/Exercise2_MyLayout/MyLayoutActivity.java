
package com.ourincheon.exerciseapplication.Exercise2_MyLayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.ourincheon.exerciseapplication.R;

public class MyLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_layout);

        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.BLUE);

        Button myButton = new Button(this);
        myButton.setText("Press Me!");
        myButton.setAllCaps(false);
        myButton.setBackgroundColor(Color.YELLOW);

        RelativeLayout.LayoutParams buttonParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
        myButton.setLayoutParams(buttonParams);

        EditText myEditText = new EditText(this);
        myEditText.setId(View.generateViewId());
        RelativeLayout.LayoutParams editTextParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        editTextParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        editTextParams.addRule(RelativeLayout.ABOVE, myButton.getId());
        myEditText.setLayoutParams(editTextParams);

        myLayout.addView(myButton);
        myLayout.addView(myEditText);
        setContentView(myLayout);
    }
}
