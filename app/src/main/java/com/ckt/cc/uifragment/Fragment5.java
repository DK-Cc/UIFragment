package com.ckt.cc.uifragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Cc on 2017/8/4.
 */

public class Fragment5 extends Fragment {
    private static final String TAG = "Fragment5";
    private static final String TEXT = "这是第五个Fragment";

    private TextView mTextView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.i(TAG, " ---> onAttach()");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, " ---> onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        Log.i(TAG, " ---> onCreateView()");

        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        mTextView = (TextView) view.findViewById(R.id.tv_show_fragment);

        mTextView.setText(TEXT);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, " ---> onViewCreated()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, " ---> onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, " ---> onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, " ---> onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, " ---> onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, " ---> onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, " ---> onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, " ---> onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, " ---> onDetach()");
    }
}
