package com.datasoft.co_op360.presentation.branchmanager.report;

/**
 * Created by mehedi on 3/18/17.
 */

public interface ReportPresenter {

    void getReportList();

    void itemClick(ReportData reportData);

    void onDestroy();
}
