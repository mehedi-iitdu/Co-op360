package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.LoanPurpose;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public interface LoanPurposeRepository {

    void insert(LoanPurpose loanPurpose);

    void update(LoanPurpose loanPurpose);

    LoanPurpose getLoanPurposeById(int id);

    List<LoanPurpose> getAllLoanPurposes();

    List<LoanPurpose> getAllUnsyncedLoanPurposes();

    void markSynced(List<LoanPurpose> loanPurposes);

    void delete(LoanPurpose loanPurpose);
}
