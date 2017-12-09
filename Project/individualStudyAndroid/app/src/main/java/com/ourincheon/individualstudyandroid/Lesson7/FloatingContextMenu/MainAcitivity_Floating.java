package com.ourincheon.individualstudyandroid.Lesson7.FloatingContextMenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 9..
 */

public class MainAcitivity_Floating extends AppCompatActivity {
    static final int COLOR_RED = 1;
    static final int COLOR_GREEN = 2;
    static final int COLOR_BLUE = 3;
    TextView txtView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context_menu_main_activity);

        txtView = (TextView)findViewById(R.id.textView);
        registerForContextMenu(txtView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("context menu");
        menu.add(Menu.NONE, COLOR_RED, Menu.NONE, "backgroud: RED");
        menu.add(Menu.NONE, COLOR_GREEN, Menu.NONE, "backgroud: GREEN");
        menu.add(Menu.NONE, COLOR_BLUE, Menu.NONE, "backgroud: BLUE");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case COLOR_RED:
                txtView.setBackgroundColor(Color.RED);
                return true;
            case COLOR_GREEN:
                txtView.setBackgroundColor(Color.GREEN);
                return true;
            case COLOR_BLUE:
                txtView.setBackgroundColor(Color.BLUE);
                return true;
        }
        return super.onContextItemSelected(item);
    }
}
