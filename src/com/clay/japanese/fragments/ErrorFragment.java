/**
 * 
 */
package com.clay.japanese.fragments;

import com.clay.japanese.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 28, 2013
 * @version 0.1
 */
public class ErrorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_error, container, false);
        return view;
    }
}
