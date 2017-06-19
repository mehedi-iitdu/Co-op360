package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.model.LoanProposalData;

import java.util.List;

/**
 * Created by mehedi on 4/18/17.
 */

public interface LoanProposalInteractor {

    interface OnLoanProposalLoadFinishedListener {

        void onLoanProposalLoad(List<LoanProposalData> loanProposalDataList);
    }

    void loadLoanProposal(OnLoanProposalLoadFinishedListener listener);
}
