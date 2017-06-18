package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.ShareListItemData;

/**
 * Created by mehedi on 5/15/17.
 */

public interface FoSharePresenter {

    void getAllShares();

    void onItemClick(ShareListItemData shareListItemData);
}
