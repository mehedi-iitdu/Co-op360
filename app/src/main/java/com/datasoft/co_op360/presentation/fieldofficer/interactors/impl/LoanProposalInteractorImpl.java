package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.LoanProposalInteractor;
import com.datasoft.co_op360.domain.model.LoanProposalData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/18/17.
 */

public class LoanProposalInteractorImpl implements LoanProposalInteractor {


    @Override
    public void loadLoanProposal(OnLoanProposalLoadFinishedListener listener) {

        listener.onLoanProposalLoad(createArrayList());
    }

    private List<LoanProposalData> createArrayList() {

        List<LoanProposalData> loanProposalDataList = new ArrayList<>();

        loanProposalDataList.add(new LoanProposalData("Rabeya", "001-002-003", "Kashem (Spouse)", "10000"));
        loanProposalDataList.add(new LoanProposalData("Rabeya", "001-002-003", "Kashem (Spouse)", "105000"));
        loanProposalDataList.add(new LoanProposalData("Rabeya", "001-002-003", "Kashem (Spouse)", "9400"));
        loanProposalDataList.add(new LoanProposalData("Rabeya", "001-002-003", "Kashem (Spouse)", "5000"));

        return loanProposalDataList;
    }
}
