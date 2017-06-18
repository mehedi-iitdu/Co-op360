package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.LoanTransactionData;

/**
 * Created by mehedi on 4/17/17.
 */

public interface LoanTransactionPresenter {

    void getLoanTransactionData();

    void onItemClick(LoanTransactionData loanTransactionData);
}
