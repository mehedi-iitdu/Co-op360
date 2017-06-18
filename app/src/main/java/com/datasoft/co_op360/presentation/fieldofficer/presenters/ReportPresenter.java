package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.ReportData;

/**
 * Created by mehedi on 3/18/17.
 */

public interface ReportPresenter {

    void getReportList();

    void itemClick(ReportData reportData);

    void onDestroy();
}
