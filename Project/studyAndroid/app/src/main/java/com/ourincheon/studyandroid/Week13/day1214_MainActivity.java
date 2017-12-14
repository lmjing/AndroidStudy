package com.ourincheon.studyandroid.Week13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 14..
 */

public class day1214_MainActivity extends AppCompatActivity {

    day1214_FragmentA aFragment;
    day1213_FragmentB bFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1214_main_activity);

        aFragment = new day1214_FragmentA();
        bFragment = new day1213_FragmentB();

        if(findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.add(R.id.fragment_container, aFragment);
            transaction.commit();
        }
    }

    public void selectFragment(View v) {
        Fragment f = null;

        switch (v.getId()) {
            case R.id.fragmentOneButton: f = aFragment; break;
            case R.id.fragmentTwoButton: f = bFragment; break;
        }
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction transaction = fm.beginTransaction();
//        transaction.replace(R.id.fragment_container, f);
//        transaction.commit();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, f)
                .commit();
    }

    public void onButtonClicked() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, bFragment)
                .commit();
    }
}
