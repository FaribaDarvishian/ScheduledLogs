package com.example.scheduledlogs;


import androidx.fragment.app.Fragment;

public class LogActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return LogFragment.newInstance();
    }
}