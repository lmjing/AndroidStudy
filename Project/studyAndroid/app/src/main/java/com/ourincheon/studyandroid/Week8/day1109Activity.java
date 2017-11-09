package com.ourincheon.studyandroid.Week8;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 9..
 * 1108 수업 안들음.
 */

public class day1109Activity extends AppCompatActivity {
    static final int COLOR_RED = 1;
    static final int COLOR_GREEN = 2;
    static final int COLOR_BLUE = 3;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.day1109_context_menu);

        textView = (TextView)findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("context menu");
        menu.add(Menu.NONE, COLOR_RED, Menu.NONE, "background: RED");
        menu.add(Menu.NONE, COLOR_GREEN, Menu.NONE, "background: GREEN");
        menu.add(Menu.NONE, COLOR_BLUE, Menu.NONE, "background: BLUE");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case COLOR_RED:
                textView.setBackgroundColor(Color.RED); return true;
            case COLOR_GREEN:
                textView.setBackgroundColor(Color.GREEN); return true;
            case COLOR_BLUE:
                textView.setBackgroundColor(Color.BLUE); return true;
        }
        return super.onContextItemSelected(item);
    }
}
