package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.LoanPurposeCategory;
import com.datasoft.co_op360.storage.model.DBLoanPurposeCategory;
import com.datasoft.co_op360.domain.repository.LoanPurposeCategoryRepository;
import com.datasoft.co_op360.storage.converters.LoanPurposeCategoryModelConverter;
import com.datasoft.co_op360.storage.model.DBLoanPurposeCategory_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanPurposeCategoryRepositoryImpl implements LoanPurposeCategoryRepository {

    @Override
    public void insert(LoanPurposeCategory loanPurposeCategory) {
        DBLoanPurposeCategory dbLoanPurposeCategory = LoanPurposeCategoryModelConverter.convertDomainToStorageModel(loanPurposeCategory);
        dbLoanPurposeCategory.save();
    }

    @Override
    public void update(LoanPurposeCategory loanPurposeCategory) {
        DBLoanPurposeCategory dbLoanPurposeCategory = LoanPurposeCategoryModelConverter.convertDomainToStorageModel(loanPurposeCategory);
        dbLoanPurposeCategory.update();
    }

    @Override
    public LoanPurposeCategory getLoanPurposeCategoryById(int id) {
        DBLoanPurposeCategory dbLoanPurposeCategory = SQLite
                .select()
                .from(DBLoanPurposeCategory.class)
                .where(DBLoanPurposeCategory_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return LoanPurposeCategoryModelConverter.convertStorageToDomainModel(dbLoanPurposeCategory);
    }

    @Override
    public List<LoanPurposeCategory> getAllLoanPurposeCategorys() {

        List<DBLoanPurposeCategory> dbLoanPurposeCategorys = SQLite
                .select()
                .from(DBLoanPurposeCategory.class)
                .queryList();

        return LoanPurposeCategoryModelConverter.convertStorageListToDomainModel(dbLoanPurposeCategorys);
    }

    @Override
    public List<LoanPurposeCategory> getAllUnsyncedLoanPurposeCategorys() {
        return null;
    }

    @Override
    public void markSynced(List<LoanPurposeCategory> loanPurposeCategorys) {

    }

    @Override
    public void delete(LoanPurposeCategory loanPurposeCategory) {
        DBLoanPurposeCategory dbLoanPurposeCategory = LoanPurposeCategoryModelConverter.convertDomainToStorageModel(loanPurposeCategory);
        dbLoanPurposeCategory.delete();
    }
}
