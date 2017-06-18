package com.datasoft.co_op360.network.download;

/**
 * Created by mehedi on 6/3/17.
 */

public interface DownloadConfiguration {
    interface CallBack {

        void onConfigurationDownloaded();
        void onConfigurationDownloadError();
    }
}
