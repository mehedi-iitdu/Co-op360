package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.storage.converters.SavingProductModelConverter;
import com.datasoft.co_op360.storage.model.DBSavingProduct;
import com.datasoft.co_op360.domain.model.SavingProduct;
import com.datasoft.co_op360.domain.repository.SavingProductRepository;
import com.datasoft.co_op360.storage.model.DBSaving_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public class SavingProductRepositoryImpl implements SavingProductRepository {
    @Override
    public void insert(SavingProduct savingProduct) {
        DBSavingProduct dbSavingProduct = SavingProductModelConverter.convertDomainToStorageModel(savingProduct);
        dbSavingProduct.save();
    }

    @Override
    public void update(SavingProduct savingProduct) {
        DBSavingProduct dbSavingProduct = SavingProductModelConverter.convertDomainToStorageModel(savingProduct);
        dbSavingProduct.update();
    }

    @Override
    public SavingProduct getSavingProductById(int id) {
        DBSavingProduct dbSavingProduct = SQLite
                .select()
                .from(DBSavingProduct.class)
                .where(DBSaving_Table.id.eq(String.valueOf(id)))
                .querySingle();
        return SavingProductModelConverter.convertStorageToDomainModel(dbSavingProduct);
    }

    @Override
    public List<SavingProduct> getAllSavingProducts() {
        List<DBSavingProduct> dbSavingProducts = SQLite
                .select()
                .from(DBSavingProduct.class)
                .queryList();

        return SavingProductModelConverter.convertStorageListToDomainModel(dbSavingProducts);
    }

    @Override
    public List<SavingProduct> getAllUnsyncedSavingProducts() {
        return null;
    }

    @Override
    public void markSynced(List<SavingProduct> savingProducts) {

    }

    @Override
    public void delete(SavingProduct savingProduct) {
        DBSavingProduct dbSavingProduct = SavingProductModelConverter.convertDomainToStorageModel(savingProduct);
        dbSavingProduct.delete();
    }
}
