package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.SavingsListItemData;

import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public interface FoSavingsListView {

    void showSavings(List<SavingsListItemData> savingsListItemDatas);

    void ItemClick(SavingsListItemData savingsListItemData);

    void showProgress();

    void hideProgress();
}
