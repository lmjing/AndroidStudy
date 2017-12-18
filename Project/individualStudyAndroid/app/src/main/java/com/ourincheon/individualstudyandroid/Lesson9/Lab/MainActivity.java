package com.ourincheon.individualstudyandroid.Lesson9.Lab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class MainActivity extends FragmentActivity
    implements WordsFragment.OnWordSelectedListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab9_activity_main);

        View test = findViewById(R.id.fragment_container);
        if (test != null) {
            if (savedInstanceState != null) {
                return;
            }
            WordsFragment firstFragment = new WordsFragment();
            firstFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        }
    }

    @Override
    public void onWordSelected(int position) {
        DefinitionFragment defFrag = (DefinitionFragment)getSupportFragmentManager().findFragmentById(R.id.definition_fragment);
        if (defFrag != null) {
            defFrag.updateDefinitionView(position);
        }else {
            DefinitionFragment newFragment = new DefinitionFragment();

            Bundle args = new Bundle();
            args.putInt(DefinitionFragment.ARG_POSITION, position);
            newFragment.setArguments(args);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
