package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;

/**
 * Created by mehedi on 4/19/17.
 */

public interface FoDetailsLoanTransactionPresenter {

    void getDetailsLoanTransactionData();

    void onEditClick(IndividualLoanTransactionData individualLoanTransactionData);

    void onDeleteClick(IndividualLoanTransactionData individualLoanTransactionData);

    void onDestroy();
}
