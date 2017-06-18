package com.datasoft.co_op360.network.download;

/**
 * Created by mehedi on 6/8/17.
 */

public interface DownloadSaving {

    interface CallBack {

        void onSavingDownloaded();

        void onSavingDownloadError();
    }
}
