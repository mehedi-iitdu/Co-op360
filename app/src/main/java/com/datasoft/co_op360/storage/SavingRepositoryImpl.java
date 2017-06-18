package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.repository.SavingRepository;
import com.datasoft.co_op360.storage.converters.SavingModelConverter;
import com.datasoft.co_op360.storage.model.DBSaving;
import com.datasoft.co_op360.domain.model.Saving;
import com.datasoft.co_op360.storage.model.DBSaving_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public class SavingRepositoryImpl implements SavingRepository {

    @Override
    public void insert(Saving saving) {
        DBSaving dbSaving = SavingModelConverter.convertDomainToStorageModel(saving);
        dbSaving.save();
    }

    @Override
    public void update(Saving saving) {
        DBSaving dbSaving = SavingModelConverter.convertDomainToStorageModel(saving);
        dbSaving.update();
    }

    @Override
    public Saving getSavingById(int id) {
        DBSaving dbSaving = SQLite
                .select()
                .from(DBSaving.class)
                .where(DBSaving_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return SavingModelConverter.convertStorageToDomainModel(dbSaving);
    }

    @Override
    public List<Saving> getAllSavings() {
        List<DBSaving> dbSavings = SQLite
                .select()
                .from(DBSaving.class)
                .queryList();

        return SavingModelConverter.convertStorageListToDomainModel(dbSavings);
    }

    @Override
    public List<Saving> getAllUnsyncedSavings() {
        return null;
    }

    @Override
    public void markSynced(List<Saving> savings) {

    }

    @Override
    public void delete(Saving saving) {
        DBSaving dbSaving = SavingModelConverter.convertDomainToStorageModel(saving);
        dbSaving.delete();
    }
}
