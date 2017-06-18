package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.storage.converters.SamityModelConveter;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.domain.repository.SamityRepository;
import com.datasoft.co_op360.storage.model.DBSamity;
import com.datasoft.co_op360.storage.model.DBSamity_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import java.util.List;

/**
 * Created by mehedi on 6/14/17.
 */

public class SamityRepositoryImpl implements SamityRepository{
    @Override
    public void insert(Samity samity) {
        DBSamity dbSamity = SamityModelConveter.convertDomainToStorageModel(samity);
        dbSamity.save();
    }

    @Override
    public void update(Samity samity) {
        DBSamity dbSamity = SamityModelConveter.convertDomainToStorageModel(samity);
        dbSamity.update();
    }

    @Override
    public Samity getSamityById(int id) {
        DBSamity dbSamity = SQLite
                .select()
                .from(DBSamity.class)
                .where(DBSamity_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return SamityModelConveter.convertStorageToDomainModel(dbSamity);
    }

    @Override
    public List<Samity> getSamityListByDay(String day) {
        List<DBSamity> dbSamities = SQLite
                .select()
                .from(DBSamity.class)
                .where(DBSamity_Table.samityDay.eq(day))
                .queryList();

        return SamityModelConveter.convertStorageListToDomainModel(dbSamities);
    }

    @Override
    public List<Samity> getAllSamities() {
        List<DBSamity> dbSamities = SQLite
                .select()
                .from(DBSamity.class)
                .queryList();

        return SamityModelConveter.convertStorageListToDomainModel(dbSamities);
    }

    @Override
    public void delete(Samity samity) {
        DBSamity dbSamity = SamityModelConveter.convertDomainToStorageModel(samity);
        dbSamity.delete();
    }
}
