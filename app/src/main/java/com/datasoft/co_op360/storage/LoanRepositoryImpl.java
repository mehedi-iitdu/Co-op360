package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.storage.model.DBLoan;
import com.datasoft.co_op360.domain.model.Loan;
import com.datasoft.co_op360.domain.repository.LoanRepository;
import com.datasoft.co_op360.storage.converters.LoanModelConverter;
import com.datasoft.co_op360.storage.model.DBLoan_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanRepositoryImpl implements LoanRepository {

    @Override
    public void insert(Loan loan) {
        DBLoan dbLoan = LoanModelConverter.convertDomainToStorageModel(loan);
        dbLoan.save();
    }

    @Override
    public void update(Loan loan) {
        DBLoan dbLoan = LoanModelConverter.convertDomainToStorageModel(loan);
        dbLoan.update();
    }

    @Override
    public Loan getMemberById(int id) {
        DBLoan dbLoan = SQLite
                .select()
                .from(DBLoan.class)
                .where(DBLoan_Table.id.eq(id))
                .querySingle();

        return LoanModelConverter.convertStorageToDomainModel(dbLoan);
    }

    @Override
    public List<Loan> getAllLoans() {
        List<DBLoan> dbLoans = SQLite
                .select()
                .from(DBLoan.class)
                .queryList();

        return LoanModelConverter.convertStorageListToDomainModel(dbLoans);
    }

    @Override
    public List<Loan> getAllUnsyncedLoans() {
        return null;
    }

    @Override
    public void markSynced(List<Loan> loen) {

    }

    @Override
    public void delete(Loan loan) {

        DBLoan dbLoan = LoanModelConverter.convertDomainToStorageModel(loan);
        dbLoan.delete();
    }
}
