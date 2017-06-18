package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.ReportData;

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
