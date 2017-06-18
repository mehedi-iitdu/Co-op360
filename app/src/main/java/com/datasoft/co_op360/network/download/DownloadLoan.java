package com.datasoft.co_op360.network.download;

import com.datasoft.co_op360.domain.interactors.base.Interactor;

/**
 * Created by mehedi on 6/6/17.
 */

public interface DownloadLoan extends Interactor {

    interface CallBack {

        void onLoanDownloaded();

        void onLoanDownloadError();
    }
}
