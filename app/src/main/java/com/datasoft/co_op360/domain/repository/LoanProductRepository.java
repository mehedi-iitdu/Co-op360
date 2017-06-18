package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.LoanProduct;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public interface LoanProductRepository {

    void insert(LoanProduct loanProduct);

    void update(LoanProduct loanProduct);

    LoanProduct getLoanProductById(int id);

    List<LoanProduct> getAllLoanProducts();

    List<LoanProduct> getAllUnsyncedLoanProducts();

    void markSynced(List<LoanProduct> loanProducts);

    void delete(LoanProduct loanProduct);
}
