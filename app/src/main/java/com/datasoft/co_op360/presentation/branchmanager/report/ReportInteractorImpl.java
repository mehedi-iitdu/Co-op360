package com.datasoft.co_op360.presentation.branchmanager.report;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 3/19/17.
 */

public class ReportInteractorImpl implements ReportInteractor {

    @Override
    public void loadReportList(final ReportFinishedListener reportFinishedListener) {

        /*new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                reportFinishedListener.onReportListLoad(createArrayList());
            }
        }, 1000);*/

        reportFinishedListener.onReportListLoad(createArrayList());

    }

    public List<ReportData> createArrayList() {

        List<ReportData> reportDatas = new ArrayList<>();

        ReportData reportData1 = new ReportData("#4A148C", "#6A1B9A", "1", "BM First Report");
        ReportData reportData2 = new ReportData("#880E4F", "#AD1457", "2", "BM Second Report");
        ReportData reportData3 = new ReportData("#0D47A1", "#1565C0", "3", "BM Third Report");

        reportDatas.add(reportData1);
        reportDatas.add(reportData2);
        reportDatas.add(reportData3);

        return reportDatas;
    }
}
