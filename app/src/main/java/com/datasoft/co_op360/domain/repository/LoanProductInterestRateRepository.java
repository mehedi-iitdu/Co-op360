package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.LoanProductInterestRate;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public interface LoanProductInterestRateRepository {

    void insert(LoanProductInterestRate loanProductInterestRate);

    void update(LoanProductInterestRate loanProductInterestRate);

    LoanProductInterestRate getLoanProductInterestRateById(int id);

    List<LoanProductInterestRate> getAllLoanProductInterestRates();

    List<LoanProductInterestRate> getAllUnsyncedLoanProductInterestRates();

    void markSynced(List<LoanProductInterestRate> loanProductInterestRates);

    void delete(LoanProductInterestRate loanProductInterestRate);
}
