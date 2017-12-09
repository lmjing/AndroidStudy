package com.ourincheon.individualstudyandroid.Lesson7.Menu_and_ActionBar.FloatingContextMenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 9..
 */

public class MainActivity_ActionMode extends AppCompatActivity implements View.OnLongClickListener{

    ActionMode mActionMode;
    TextView txtView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context_menu_main_activity);

        txtView = (TextView)findViewById(R.id.textView);
        txtView.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        if (mActionMode != null)
            return false;

        mActionMode = this.startActionMode(mActionCallback);
        view.setSelected(true);
        return true;
    }

    ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.context_mymenu, menu);
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
                    txtView.setBackgroundColor(Color.RED);
                    return true;
                case R.id.green:
                    txtView.setBackgroundColor(Color.GREEN);
                    return true;
                case R.id.blue:
                    txtView.setBackgroundColor(Color.BLUE);
                    return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
}
