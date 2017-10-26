package com.ourincheon.studyandroid.Week7_Lab6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by mijeong on 2017. 10. 26..
 */

public class day1026_MyViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final day1026_MyView myView = new day1026_MyView(this);
        setContentView(myView);
        myView.setFocusable(true);
        myView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                //굳이 키보드가 떨어질때 실행할 필요가 없으므로 삭제해준다.
//                int action = keyEvent.getAction();
//                if ( action == keyEvent.ACTION_UP) {
                    switch (keyCode) {
                        case KeyEvent.KEYCODE_J:
                            myView.setX(-20); break;
                        case KeyEvent.KEYCODE_K:
                            myView.setX(20); break;
                        case KeyEvent.KEYCODE_M:
                            myView.setY(-20); break;
                        case KeyEvent.KEYCODE_N:
                            myView.setY(20); break;
                    }
                    view.invalidate();
                    return true;
//                }
//                return false;
            }
        });
    }
}
