package com.example.scheduledlogs.controller.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.example.scheduledlogs.R;

public class LogFragment extends Fragment {
    private Button mStartButton;
    private Button mStopButton;
    private TextView mTextViewLog;

    public LogFragment() {
        // Required empty public constructor
    }

    public static LogFragment newInstance() {
      LogFragment fragment = new LogFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //TODO
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log, container, false);
        findViews(view);
        setListeners();

        initTextView();


      //TODO

        return view;
    }

    private void initTextView() {
       //TODO
    }

    private void findViews(View view) {
        mStartButton=view.findViewById(R.id.button_start_scheduling);
        mStopButton=view.findViewById(R.id.button_stop_scheduling);
        mTextViewLog=view.findViewById(R.id.text_view_log);
    }

    private void setListeners(){
       //TODO
    }
}