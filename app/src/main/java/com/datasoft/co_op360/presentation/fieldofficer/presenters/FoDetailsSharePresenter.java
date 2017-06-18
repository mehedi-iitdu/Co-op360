package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.IndividualShareData;

/**
 * Created by mehedi on 5/15/17.
 */

public interface FoDetailsSharePresenter {

    void getDetailsShareData();

    void onDestroy();

    void onEditClick(IndividualShareData individualShareData);

    void onDeleteClick(IndividualShareData individualShareData);
}
