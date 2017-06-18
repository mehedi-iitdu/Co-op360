package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;

import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public interface FoDetailsLoanTransactionView {

    void showDetailsSavings(List<IndividualLoanTransactionData> individualLoanTransactionDataList);

    void editClick(IndividualLoanTransactionData individualLoanTransactionData);

    void deleteClick(IndividualLoanTransactionData individualLoanTransactionData);
}
