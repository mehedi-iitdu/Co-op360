package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoDetailsLoanTransactionInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.FoDetailsLoanTransactionInteractorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsLoanTransactionPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsLoanTransactionView;

import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public class FoDetailsLoanTransactionPresenterImpl implements FoDetailsLoanTransactionPresenter, FoDetailsLoanTransactionInteractor.OnDetailsLoanTransactionDataLoadFinishedListener {

    FoDetailsLoanTransactionView foDetailsLoanTransactionView;
    FoDetailsLoanTransactionInteractor foDetailsLoanTransactionInteractor;

    public FoDetailsLoanTransactionPresenterImpl(FoDetailsLoanTransactionView foDetailsLoanTransactionView) {
        this.foDetailsLoanTransactionView = foDetailsLoanTransactionView;
        foDetailsLoanTransactionInteractor = new FoDetailsLoanTransactionInteractorImpl();
    }

    @Override
    public void getDetailsLoanTransactionData() {

        foDetailsLoanTransactionInteractor.loadDetailsLoanTransactionData(this);
    }

    @Override
    public void onEditClick(IndividualLoanTransactionData individualLoanTransactionData) {

        foDetailsLoanTransactionView.editClick(individualLoanTransactionData);
    }

    @Override
    public void onDeleteClick(IndividualLoanTransactionData individualLoanTransactionData) {

        foDetailsLoanTransactionView.deleteClick(individualLoanTransactionData);
    }

    @Override
    public void onDestroy() {

        foDetailsLoanTransactionView = null;
    }

    @Override
    public void onDetailsLoanTransactionDataLoad(List<IndividualLoanTransactionData> individualLoanTransactionDataList) {

        if (foDetailsLoanTransactionView != null) {

            foDetailsLoanTransactionView.showDetailsSavings(individualLoanTransactionDataList);
        }
    }
}
