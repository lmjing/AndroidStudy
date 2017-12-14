package com.ourincheon.studyandroid.Week13;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ourincheon.studyandroid.R;

/**
 * Created by mijeong on 2017. 12. 14..
 */

public class day1214_FragmentA2 extends Fragment {

    BtnClickListener activityCallback;

    public interface BtnClickListener {
        public void onButtonClicked();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity;
        activity = (Activity)context;
        try {
            activityCallback = (BtnClickListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement BtnClickListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.day1214_fragment_a, container, false);
        Button button = (Button)rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCallback.onButtonClicked();
            }
        });

        return rootView;
    }
}
