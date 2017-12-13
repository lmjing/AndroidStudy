package com.ourincheon.studyandroid.Week13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 13..
 */

public class day1213_FragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.day1213_fragment_b, container, false);
    }
}
