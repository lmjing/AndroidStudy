package com.ourincheon.individualstudyandroid.Lesson9.Lab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ourincheon.individualstudyandroid.R;

/**
 * Created by mijeong on 2017. 12. 18..
 */

public class WordsFragment extends ListFragment {

    OnWordSelectedListener mCallback;

    public interface OnWordSelectedListener {
        public void onWordSelected(int position);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                Data.words
        );
        setListAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getFragmentManager().findFragmentById(R.id.definition_fragment) != null) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    //프래그먼트가 액티비티와 연결될 때 호출됨
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity a = null;
        // instanceof : 인스턴스 타입을 알아보기 위해
        // a instanceof b : a를 b타입으로 형변환 할 수 있는지 여부에 대해 리턴함
        if (context instanceof Activity) {
            a = (Activity)context;
        }

        try {
            mCallback = (OnWordSelectedListener)a;
        } catch (ClassCastException e) {
            throw new ClassCastException(a.toString()
            + " must implement OnWordSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        mCallback.onWordSelected(position);
        getListView().setItemChecked(position, true);
    }
}
