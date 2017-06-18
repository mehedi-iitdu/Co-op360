package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.SavingsListItemData;

/**
 * Created by mehedi on 4/11/17.
 */

public interface FoSavingsPresenter {

    void getAllSavings();

    void onItemClick(SavingsListItemData savingsListItemData);
}
