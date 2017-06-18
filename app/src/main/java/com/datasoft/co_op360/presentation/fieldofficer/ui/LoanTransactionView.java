package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.LoanTransactionData;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public interface LoanTransactionView {

    void setLoanTransactions(List<LoanTransactionData> loanTransactionDataList);

    void itemClick(LoanTransactionData loanTransactionData);
}
