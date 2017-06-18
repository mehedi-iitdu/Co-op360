package com.datasoft.co_op360.network.download;

/**
 * Created by mehedi on 6/14/17.
 */

public interface DownloadSamity {

    interface CallBack {

        void onSamityDownloaded();

        void onSamityDownloadError();
    }
}
