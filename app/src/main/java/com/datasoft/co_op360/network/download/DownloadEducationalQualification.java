package com.datasoft.co_op360.network.download;

/**
 * Created by mehedi on 6/5/17.
 */

public interface DownloadEducationalQualification {

    interface CallBack {

        void onEducationalQualificationDownloaded();

        void onEducationalQualificationDownloadError();
    }
}
