package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.LoanProduct;
import com.datasoft.co_op360.domain.repository.LoanProductRepository;
import com.datasoft.co_op360.storage.converters.LoanProductModelConverter;
import com.datasoft.co_op360.storage.model.DBLoanProduct;
import com.datasoft.co_op360.storage.model.DBLoanProduct_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanProductRepositoryImpl implements LoanProductRepository {

    @Override
    public void insert(LoanProduct loanProduct) {
        DBLoanProduct dbLoanProduct = LoanProductModelConverter.convertDomainToStorageModel(loanProduct);
        dbLoanProduct.save();
    }

    @Override
    public void update(LoanProduct loanProduct) {
        DBLoanProduct dbLoanProduct = LoanProductModelConverter.convertDomainToStorageModel(loanProduct);
        dbLoanProduct.update();
    }

    @Override
    public LoanProduct getLoanProductById(int id) {
        DBLoanProduct dbLoanProduct = SQLite
                .select()
                .from(DBLoanProduct.class)
                .where(DBLoanProduct_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return LoanProductModelConverter.convertStorageToDomainModel(dbLoanProduct);
    }

    @Override
    public List<LoanProduct> getAllLoanProducts() {

        List<DBLoanProduct> dbLoanProducts = SQLite
                .select()
                .from(DBLoanProduct.class)
                .queryList();

        return LoanProductModelConverter.convertStorageListToDomainModel(dbLoanProducts);
    }

    @Override
    public List<LoanProduct> getAllUnsyncedLoanProducts() {
        return null;
    }

    @Override
    public void markSynced(List<LoanProduct> loanProducts) {

    }

    @Override
    public void delete(LoanProduct loanProduct) {
        DBLoanProduct dbLoanProduct = LoanProductModelConverter.convertDomainToStorageModel(loanProduct);
        dbLoanProduct.delete();
    }
}
