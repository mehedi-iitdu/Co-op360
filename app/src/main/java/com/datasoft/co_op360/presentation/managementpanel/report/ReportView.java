package com.datasoft.co_op360.presentation.managementpanel.report;

import java.util.List;

/**
 * Created by mehedi on 3/18/17.
 */

public interface ReportView {

    void setReportList(List<ReportData> reportDatas);

/*    void showProgress();

    void hideProgress();*/

    void onItemClick(ReportData reportData);
}
