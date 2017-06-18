package com.datasoft.co_op360.domain.repository;


import com.datasoft.co_op360.domain.model.Loan;

import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public interface LoanRepository {

    void insert(Loan loan);

    void update(Loan loan);

    Loan getMemberById(int id);

    List<Loan> getAllLoans();

    List<Loan> getAllUnsyncedLoans();

    void markSynced(List<Loan> loen);

    void delete(Loan loan);
}
