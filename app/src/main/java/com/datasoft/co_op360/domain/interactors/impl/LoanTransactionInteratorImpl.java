package com.datasoft.co_op360.domain.interactors.impl;

import com.datasoft.co_op360.domain.model.LoanTransactionData;
import com.datasoft.co_op360.domain.interactors.LoanTransactionInterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class LoanTransactionInteratorImpl implements LoanTransactionInterator {
    @Override
    public void loadLoanTransaction(OnLoanTransactionLoadFinishedListener listener) {
        listener.onLoanTransactionLoad(createArraylist());
    }

    private List<LoanTransactionData> createArraylist() {

        List<LoanTransactionData> loanTransactionDataList = new ArrayList<>();

        loanTransactionDataList.add(new LoanTransactionData("Rabeya", "001-003", "Abul Kashem (Spouse)", "500"));
        loanTransactionDataList.add(new LoanTransactionData("Khaleda Begum", "001-002", "Kabir Ahmed (Spouse)", "220"));

        return loanTransactionDataList;
    }
}
