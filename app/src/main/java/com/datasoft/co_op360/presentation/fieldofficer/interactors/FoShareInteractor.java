package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.ShareListItemData;

import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public interface FoShareInteractor {

    void loadSharesData(FoSharesLoadFinishedListener listener);

    interface FoSharesLoadFinishedListener {

        void onSharesLoad(List<ShareListItemData> list);
    }
}
