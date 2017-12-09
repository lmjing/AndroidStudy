package com.ourincheon.individualstudyandroid.Lesson7.OptionMenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 9..
 */

public class MainActiviy extends AppCompatActivity {

    //실습2
    static final int FIRST_MENU = 1;
    static final int SECOND_MENU = 2;
    static final int THIRD_MENU = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu_activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //실습1 - 메뉴 따로 정의해서 생성하기
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.mymenu, menu);

        //실습2 - 코드로 옵션 메뉴 생성하기
        MenuItem item1 = menu.add(0, FIRST_MENU, Menu.NONE, "apple");
        item1.setIcon(R.mipmap.ic_launcher);
        menu.add(0, SECOND_MENU, Menu.NONE, "grape").setIcon(R.mipmap.ic_launcher);
        menu.add(0, THIRD_MENU, Menu.NONE, "banna").setIcon(R.mipmap.ic_launcher);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.apple:
            case FIRST_MENU:
                Toast.makeText(getApplicationContext(), "사과 메뉴",Toast.LENGTH_SHORT).show();
                return true;
//            case R.id.grape:
            case SECOND_MENU:
                Toast.makeText(getApplicationContext(), "포도 메뉴",Toast.LENGTH_SHORT).show();
                return true;
//            case R.id.banna:
            case THIRD_MENU:
                Toast.makeText(getApplicationContext(), "바나나 메뉴",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
