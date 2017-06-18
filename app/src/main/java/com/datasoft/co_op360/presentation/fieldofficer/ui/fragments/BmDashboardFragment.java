package com.datasoft.co_op360.presentation.fieldofficer.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.datasoft.co_op360.R;

/**
 * Created by Ratan on 7/29/2015.
 */

public class BmDashboardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.e("onCreateView", "Dashboard");

        View view = inflater.inflate(R.layout.fo_dashboard_fragment, null);

        return view;
    }

}
