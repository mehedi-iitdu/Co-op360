package com.datasoft.co_op360.presentation.fieldofficer.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.ProcessData;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.ProcessCardAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.ProcessPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.ProcessPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoProcessView;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.AutoProcessGroupList;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoGroupActivity;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoLoanActivity;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoMemberAcivity;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoSavingsActivity;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoShareActivity;
import com.datasoft.co_op360.utils.GridAutoFitLayoutManager;

import java.util.List;

/**
 * Created by Ratan on 7/29/2015.
 */
public class FoProcessFragment extends Fragment implements FoProcessView {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    ProcessCardAdapter adapter;
    ProcessPresenter processPresenter;

    public static float dipToPixels(Context context, float dipValue) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();

        Log.e("dipToPixels", String.valueOf(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, metrics)));

        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, metrics);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.e("onCreateView", "Process");

        View view = inflater.inflate(R.layout.fo_process_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.cv_process_list);

        processPresenter = new ProcessPresenterImpl(this);
        processPresenter.getProcessData();

        return view;
    }

    @Override
    public void setProcesses(List<ProcessData> list) {

        Log.e("Set Process", list.toString());
        adapter = new ProcessCardAdapter(getContext(), list, processPresenter);

        gridLayoutManager = new GridAutoFitLayoutManager(getContext(), (int) dipToPixels(getContext(), (float) 175));
        //recyclerView.addItemDecoration(new MarginDecoration(getContext()));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemclick(ProcessData processData) {

        /*Toast.makeText(getContext(), processData.getProcess_name(), Toast.LENGTH_SHORT).show();*/

        switch (processData.getProcess_name()) {

            case "Auto Process":
                startActivity(new Intent(getActivity(), AutoProcessGroupList.class));
                break;

            case "Group":
                startActivity(new Intent(getActivity(), FoGroupActivity.class));
                break;

            case "Member":
                startActivity(new Intent(getActivity(), FoMemberAcivity.class));
                break;

            case "Share":
                startActivity(new Intent(getActivity(), FoShareActivity.class));
                break;
            case "Savings":
                startActivity(new Intent(getActivity(), FoSavingsActivity.class));
                break;
            case "Loan":
                startActivity(new Intent(getActivity(), FoLoanActivity.class));
                break;

        }
    }

    @Override
    public void onDestroy() {
        processPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        processPresenter.getProcessData();
    }

}
