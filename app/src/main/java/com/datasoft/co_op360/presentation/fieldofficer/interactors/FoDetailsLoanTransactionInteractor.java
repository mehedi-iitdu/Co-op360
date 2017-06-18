package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;

import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public interface FoDetailsLoanTransactionInteractor {

    interface OnDetailsLoanTransactionDataLoadFinishedListener {

        void onDetailsLoanTransactionDataLoad(List<IndividualLoanTransactionData> individualLoanTransactionDataList);
    }

    void loadDetailsLoanTransactionData(OnDetailsLoanTransactionDataLoadFinishedListener listener);
}
