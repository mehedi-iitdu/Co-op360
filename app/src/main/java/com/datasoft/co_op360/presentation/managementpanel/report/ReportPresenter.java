package com.datasoft.co_op360.presentation.managementpanel.report;

/**
 * Created by mehedi on 3/18/17.
 */

public interface ReportPresenter {

    void getReportList();

    void itemClick(ReportData reportData);

    void onDestroy();
}
