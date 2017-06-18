package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.LoanProductInterestRate;
import com.datasoft.co_op360.domain.repository.LoanProductInterestRateRepository;
import com.datasoft.co_op360.storage.converters.LoanProductInterestRateModelConverter;
import com.datasoft.co_op360.storage.model.DBLoanProductInterestRate;
import com.datasoft.co_op360.storage.model.DBLoanProductInterestRate_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanProductInterestRateRepositoryImpl implements LoanProductInterestRateRepository {

    @Override
    public void insert(LoanProductInterestRate loanProductInterestRate) {
        DBLoanProductInterestRate dbLoanProductInterestRate = LoanProductInterestRateModelConverter.convertDomainToStorageModel(loanProductInterestRate);
        dbLoanProductInterestRate.save();
    }

    @Override
    public void update(LoanProductInterestRate loanProductInterestRate) {
        DBLoanProductInterestRate dbLoanProductInterestRate = LoanProductInterestRateModelConverter.convertDomainToStorageModel(loanProductInterestRate);
        dbLoanProductInterestRate.update();
    }

    @Override
    public LoanProductInterestRate getLoanProductInterestRateById(int id) {
        DBLoanProductInterestRate dbLoanProductInterestRate = SQLite
                .select()
                .from(DBLoanProductInterestRate.class)
                .where(DBLoanProductInterestRate_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return LoanProductInterestRateModelConverter.convertStorageToDomainModel(dbLoanProductInterestRate);
    }

    @Override
    public List<LoanProductInterestRate> getAllLoanProductInterestRates() {

        List<DBLoanProductInterestRate> dbLoanProductInterestRates = SQLite
                .select()
                .from(DBLoanProductInterestRate.class)
                .queryList();

        return LoanProductInterestRateModelConverter.convertStorageListToDomainModel(dbLoanProductInterestRates);
    }

    @Override
    public List<LoanProductInterestRate> getAllUnsyncedLoanProductInterestRates() {
        return null;
    }

    @Override
    public void markSynced(List<LoanProductInterestRate> loanProductInterestRates) {

    }

    @Override
    public void delete(LoanProductInterestRate loanProductInterestRate) {
        DBLoanProductInterestRate dbLoanProductInterestRate = LoanProductInterestRateModelConverter.convertDomainToStorageModel(loanProductInterestRate);
        dbLoanProductInterestRate.delete();
    }
}
