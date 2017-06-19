package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.LoanTransactionData;
import com.datasoft.co_op360.domain.interactors.LoanTransactionInterator;
import com.datasoft.co_op360.presentation.fieldofficer.ui.LoanTransactionView;
import com.datasoft.co_op360.domain.interactors.impl.LoanTransactionInteratorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanTransactionPresenter;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class LoanTransactionPresenterImpl implements LoanTransactionPresenter, LoanTransactionInterator.OnLoanTransactionLoadFinishedListener {

    LoanTransactionView loanTransactionView;
    LoanTransactionInterator loanTransactionInterator;

    public LoanTransactionPresenterImpl(LoanTransactionView loanTransactionView) {

        this.loanTransactionView = loanTransactionView;
        loanTransactionInterator = new LoanTransactionInteratorImpl();
    }

    @Override
    public void getLoanTransactionData() {

        loanTransactionInterator.loadLoanTransaction(this);
    }

    @Override
    public void onItemClick(LoanTransactionData loanTransactionData) {

        if (loanTransactionView != null) {
            loanTransactionView.itemClick(loanTransactionData);
        }
    }

    @Override
    public void onLoanTransactionLoad(List<LoanTransactionData> loanTransactionDataList) {

        if (loanTransactionView != null) {
            loanTransactionView.setLoanTransactions(loanTransactionDataList);
        }
    }
}
