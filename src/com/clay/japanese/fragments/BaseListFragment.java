/**
 * 
 */
package com.clay.japanese.fragments;

import com.clay.japanese.activities.BaseFrameActivity;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 28, 2013
 * @version 0.1
 */
public abstract class BaseListFragment extends ListFragment {
    public void onError(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ErrorFragment errorFragment = new ErrorFragment();
        ((BaseFrameActivity) this.getActivity()).switchFragment(errorFragment);
    }
}
