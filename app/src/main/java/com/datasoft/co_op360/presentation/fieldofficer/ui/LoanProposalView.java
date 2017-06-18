package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.LoanProposalData;

import java.util.List;

/**
 * Created by mehedi on 4/18/17.
 */

public interface LoanProposalView {

    void setLoanProposals(List<LoanProposalData> loanProposalDataList);

    void itemClick(LoanProposalData loanProposalData);
}
