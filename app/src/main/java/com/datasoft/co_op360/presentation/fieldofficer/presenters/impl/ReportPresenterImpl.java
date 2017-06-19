package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.ReportData;
import com.datasoft.co_op360.domain.interactors.ReportInteractor;
import com.datasoft.co_op360.domain.interactors.impl.ReportInteractorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.ReportPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.ReportView;

import java.util.List;

/**
 * Created by mehedi on 3/19/17.
 */

public class ReportPresenterImpl implements ReportPresenter, ReportInteractor.ReportFinishedListener {

    ReportView reportView;
    ReportInteractor reportInteractor;

    public ReportPresenterImpl(ReportView reportView){
        this.reportView = reportView;
        this.reportInteractor = new ReportInteractorImpl();
    }

    @Override
    public void getReportList() {

        if (reportView != null){

            //sreportView.showProgress();
        }

        reportInteractor.loadReportList(this);
    }

    @Override
    public void itemClick(ReportData reportData) {
        if (reportView  != null){

            reportView.onItemClick(reportData);
        }
    }

    @Override
    public void onDestroy() {

        reportView = null;
    }


    @Override
    public void onReportListLoad(List<ReportData> reportDatas) {

        if (reportView!=null){

            reportView.setReportList(reportDatas);
            //reportView.hideProgress();
        }
    }
}
