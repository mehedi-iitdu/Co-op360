package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.storage.model.DBLoanPurpose;
import com.datasoft.co_op360.domain.model.LoanPurpose;
import com.datasoft.co_op360.domain.repository.LoanPurposeRepository;
import com.datasoft.co_op360.storage.converters.LoanPurposeModelConverter;
import com.datasoft.co_op360.storage.model.DBLoanPurpose_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanPurposeRepositoryImpl implements LoanPurposeRepository {

    @Override
    public void insert(LoanPurpose loanPurpose) {
        DBLoanPurpose dbLoanPurpose = LoanPurposeModelConverter.convertDomainToStorageModel(loanPurpose);
        dbLoanPurpose.save();
    }

    @Override
    public void update(LoanPurpose loanPurpose) {
        DBLoanPurpose dbLoanPurpose = LoanPurposeModelConverter.convertDomainToStorageModel(loanPurpose);
        dbLoanPurpose.update();
    }

    @Override
    public LoanPurpose getLoanPurposeById(int id) {
        DBLoanPurpose dbLoanPurpose = SQLite
                .select()
                .from(DBLoanPurpose.class)
                .where(DBLoanPurpose_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return LoanPurposeModelConverter.convertStorageToDomainModel(dbLoanPurpose);
    }

    @Override
    public List<LoanPurpose> getAllLoanPurposes() {

        List<DBLoanPurpose> dbLoanPurposes = SQLite
                .select()
                .from(DBLoanPurpose.class)
                .queryList();

        return LoanPurposeModelConverter.convertStorageListToDomainModel(dbLoanPurposes);
    }

    @Override
    public List<LoanPurpose> getAllUnsyncedLoanPurposes() {
        return null;
    }

    @Override
    public void markSynced(List<LoanPurpose> loanPurposes) {

    }

    @Override
    public void delete(LoanPurpose loanPurpose) {
        DBLoanPurpose dbLoanPurpose = LoanPurposeModelConverter.convertDomainToStorageModel(loanPurpose);
        dbLoanPurpose.delete();
    }
}
