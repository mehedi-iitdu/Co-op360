package com.datasoft.co_op360.presentation.fieldofficer.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.datasoft.co_op360.domain.model.ReportData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.ReportPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.ReportView;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.ReportListAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.ReportPresenterImpl;

import java.util.List;

/**
 * Created by Ratan on 7/29/2015.
 */
public class FoReportFragment extends Fragment implements ReportView {

    RecyclerView recyclerView;
    ReportListAdapter reportListAdapter;
    ReportPresenter reportPresenter;
    /*private ProgressDialog progressDialog;*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;

        view = inflater.inflate(R.layout.fo_report_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.cv_report_list);
        reportPresenter = new ReportPresenterImpl(this);

        reportPresenter.getReportList();

        Log.e("onCreateView", "Report");

        return view;
    }

/*    @Override
    public void onResume() {

        Log.e("onResume", "Report");
        super.onResume();
        reportPresenter.getReportList();
    }*/

    @Override
    public void setReportList(List<ReportData> reportDatas) {

        reportListAdapter = new ReportListAdapter(getActivity(), reportDatas, reportPresenter);
        recyclerView.setAdapter(reportListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

/*    @Override
    public void showProgress() {

        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Reports Loading...");
        progressDialog.show();
    }*/

/*    @Override
    public void hideProgress() {

        progressDialog.dismiss();
    }*/

    @Override
    public void onDestroy() {
        reportPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onItemClick(ReportData reportData) {

        Toast.makeText(getContext(), reportData.getReport_name(), Toast.LENGTH_SHORT).show();
    }


}
