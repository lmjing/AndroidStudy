package com.ourincheon.studyandroid.Week8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 9..
 */

public class day1109_PopupActivity extends AppCompatActivity {
    ActionMode mActionMode;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1109_popup_menu);
    }

    public void onClick(View v) {
        PopupMenu pop = new PopupMenu(this, v);
        pop.getMenuInflater().inflate(R.menu.day1109_popup, pop.getMenu());
        pop.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getApplicationContext(),
                                "선택된 팝업 메뉴" + item.getTitle(),
                                Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
        pop.show();
    }
}
