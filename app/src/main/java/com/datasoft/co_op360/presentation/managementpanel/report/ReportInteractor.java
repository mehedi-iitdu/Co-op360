package com.datasoft.co_op360.presentation.managementpanel.report;

import java.util.List;

/**
 * Created by mehedi on 3/19/17.
 */

public interface ReportInteractor {

    interface ReportFinishedListener {

        void onReportListLoad(List<ReportData> reportDatas);
    }

    void loadReportList(ReportFinishedListener reportFinishedListener);
}
