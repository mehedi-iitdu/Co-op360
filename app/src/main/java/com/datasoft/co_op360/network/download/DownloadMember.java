package com.datasoft.co_op360.network.download;

import com.datasoft.co_op360.domain.interactors.base.Interactor;

/**
 * Created by mehedi on 6/11/17.
 */

public interface DownloadMember extends Interactor {

    interface CallBack {

        void onMemberDownloaded();

        void onMemberDownloadError();
    }
}
