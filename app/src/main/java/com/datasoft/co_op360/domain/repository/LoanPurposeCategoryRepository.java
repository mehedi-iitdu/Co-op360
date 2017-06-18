package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.LoanPurposeCategory;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public interface LoanPurposeCategoryRepository {

    void insert(LoanPurposeCategory loanPurposeCategory);

    void update(LoanPurposeCategory loanPurposeCategory);

    LoanPurposeCategory getLoanPurposeCategoryById(int id);

    List<LoanPurposeCategory> getAllLoanPurposeCategorys();

    List<LoanPurposeCategory> getAllUnsyncedLoanPurposeCategorys();

    void markSynced(List<LoanPurposeCategory> loanPurposeCategorys);

    void delete(LoanPurposeCategory loanPurposeCategory);
}
