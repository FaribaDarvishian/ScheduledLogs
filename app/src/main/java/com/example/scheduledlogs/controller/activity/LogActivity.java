package com.example.scheduledlogs.controller.activity;


import androidx.fragment.app.Fragment;

import com.example.scheduledlogs.controller.fragment.LogFragment;

public class LogActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return LogFragment.newInstance();
    }
}