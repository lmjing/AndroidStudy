package com.ourincheon.studyandroid.Week8;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 11. 9..
 */

public class day1109_contextLongActivity extends AppCompatActivity implements View.OnLongClickListener{
    TextView textView;
    ActionMode mActionMode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1109_context_menu);

        textView = (TextView) findViewById(R.id.textView);
        textView.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        if (mActionMode != null) {
            return false;
        }
        mActionMode = this.startActionMode(mActionCallback);
        return true;
    }

    ActionMode.Callback mActionCallback = new ActionMode.Callback() {

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            getMenuInflater().inflate(R.menu.day1108_mymenu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.red:
                    textView.setBackgroundColor(Color.RED); return true;
                case R.id.blue:
                    textView.setBackgroundColor(Color.BLUE); return true;
                case R.id.green:
                    textView.setBackgroundColor(Color.GREEN); return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
}
