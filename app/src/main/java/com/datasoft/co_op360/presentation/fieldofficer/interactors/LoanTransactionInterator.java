package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.LoanTransactionData;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public interface LoanTransactionInterator {

    interface OnLoanTransactionLoadFinishedListener {

        void onLoanTransactionLoad(List<LoanTransactionData> loanTransactionDataList);
    }

    void loadLoanTransaction(OnLoanTransactionLoadFinishedListener listener);
}

