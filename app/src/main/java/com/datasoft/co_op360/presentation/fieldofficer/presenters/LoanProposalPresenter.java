package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.LoanProposalData;

/**
 * Created by mehedi on 4/18/17.
 */

public interface LoanProposalPresenter {

    void getLoanProposalData();

    void onItemClick(LoanProposalData loanProposalData);
}
