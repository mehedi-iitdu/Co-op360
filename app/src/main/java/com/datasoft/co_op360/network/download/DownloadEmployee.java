package com.datasoft.co_op360.network.download;

import com.datasoft.co_op360.domain.interactors.base.Interactor;

/**
 * Created by mehedi on 6/12/17.
 */

public interface DownloadEmployee extends Interactor {

    interface CallBack {

        void onEmployeeDownloaded();

        void onEmployeeDownloadError();
    }
}
