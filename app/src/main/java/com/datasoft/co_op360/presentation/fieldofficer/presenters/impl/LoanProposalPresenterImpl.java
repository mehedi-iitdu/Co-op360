package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.interactors.impl.LoanProposalInteractorImpl;
import com.datasoft.co_op360.domain.interactors.LoanProposalInteractor;
import com.datasoft.co_op360.domain.model.LoanProposalData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanProposalPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.LoanProposalView;

import java.util.List;

/**
 * Created by mehedi on 4/18/17.
 */

public class LoanProposalPresenterImpl implements LoanProposalPresenter, LoanProposalInteractor.OnLoanProposalLoadFinishedListener {

    LoanProposalView loanProposalView;
    LoanProposalInteractor loanProposalInteractor;

    public LoanProposalPresenterImpl(LoanProposalView loanProposalView) {

        this.loanProposalView = loanProposalView;
        loanProposalInteractor = new LoanProposalInteractorImpl();

    }

    @Override
    public void getLoanProposalData() {

        loanProposalInteractor.loadLoanProposal(this);
    }

    @Override
    public void onItemClick(LoanProposalData loanProposalData) {
        if (loanProposalView != null) {

            loanProposalView.itemClick(loanProposalData);
        }

    }

    @Override
    public void onLoanProposalLoad(List<LoanProposalData> loanProposalDataList) {

        if (loanProposalView != null) {
            loanProposalView.setLoanProposals(loanProposalDataList);
        }
    }
}
