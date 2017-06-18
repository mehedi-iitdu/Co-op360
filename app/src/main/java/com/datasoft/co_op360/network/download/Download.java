package com.datasoft.co_op360.network.download;

/**
 * Created by mehedi on 6/1/17.
 */

public interface Download {

    void downloadConfig();
    void downloadEducationalQualification();
    void downloadMember();
    void downloadLoan();
    void downloadSaving();
    void downloadEmployee();
    void downloadSamity();

    interface Callback {
        void onDownloadComplete();
    }
}
