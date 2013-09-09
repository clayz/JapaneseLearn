package com.clay.japanese.activities;

import com.clay.japanese.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Application main activity.
 * 
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 10, 2013
 * @version 0.1
 */
public class IndexActivity extends BaseFrameActivity {
    private Fragment fragment;

    public IndexActivity() {
        super(R.string.app_name);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        // getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new MenuFragment()).commit();
        setSlidingActionBarEnabled(false);
    }

    @Override
    public void switchFragment(Fragment fragment) {
        this.fragment = fragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, this.fragment).commit();
        getSlidingMenu().showContent();
    }
}
