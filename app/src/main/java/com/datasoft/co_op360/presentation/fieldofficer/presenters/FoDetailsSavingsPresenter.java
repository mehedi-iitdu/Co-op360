package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.IndividualSavingsData;

/**
 * Created by mehedi on 4/16/17.
 */

public interface FoDetailsSavingsPresenter {

    void getDetailsSavingsData();

    void onDestroy();

    void onEditClick(IndividualSavingsData individualSavingsData);

    void onDeleteClick(IndividualSavingsData individualSavingsData);
}

