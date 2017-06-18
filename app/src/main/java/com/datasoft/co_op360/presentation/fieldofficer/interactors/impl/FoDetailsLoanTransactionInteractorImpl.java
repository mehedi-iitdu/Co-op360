package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoDetailsLoanTransactionInteractor;
import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public class FoDetailsLoanTransactionInteractorImpl implements FoDetailsLoanTransactionInteractor {
    @Override
    public void loadDetailsLoanTransactionData(OnDetailsLoanTransactionDataLoadFinishedListener listener) {

        listener.onDetailsLoanTransactionDataLoad(createArrayList());
    }

    private List<IndividualLoanTransactionData> createArrayList() {

        List<IndividualLoanTransactionData> individualLoanTransactionDataList = new ArrayList<>();

        individualLoanTransactionDataList.add(new IndividualLoanTransactionData("LP-001-002", "50000"));
        individualLoanTransactionDataList.add(new IndividualLoanTransactionData("LP-002-054", "10000"));

        return individualLoanTransactionDataList;
    }
}
