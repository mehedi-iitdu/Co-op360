package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.ShareListItemData;

import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public interface FoShareListView {

    void showShares(List<ShareListItemData> shareListItemDataList);

    void ItemClick(ShareListItemData shareListItemData);

    void showProgress();

    void hideProgress();
}
