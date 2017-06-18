package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.EducationalQualification;
import com.datasoft.co_op360.storage.converters.EducationalQualificationConverter;
import com.datasoft.co_op360.storage.model.DBEducationalQualification;
import com.datasoft.co_op360.domain.repository.EducationalQualificationRepository;
import com.datasoft.co_op360.storage.model.DBEducationalQualification_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public class EducationalQualificationRepositoryImpl implements EducationalQualificationRepository {

    @Override
    public void insert(EducationalQualification educationalQualification) {

        DBEducationalQualification dbEducationalQualification = EducationalQualificationConverter.convertDomainToStorageModel(educationalQualification);
        dbEducationalQualification.save();
    }

    @Override
    public void update(EducationalQualification educationalQualification) {

        DBEducationalQualification dbEducationalQualification = EducationalQualificationConverter.convertDomainToStorageModel(educationalQualification);
        dbEducationalQualification.update();
    }

    @Override
    public EducationalQualification getEducationalQualificationById(String id) {

        DBEducationalQualification dbEducationalQualification = SQLite
                .select()
                .from(DBEducationalQualification.class)
                .where(DBEducationalQualification_Table.id.eq(id))
                .querySingle();

        return EducationalQualificationConverter.convertStorageToDomainModel(dbEducationalQualification);
    }

    @Override
    public List<EducationalQualification> getAllEducationalQualification() {

        List<DBEducationalQualification> dbEducationalQualifications = SQLite
                .select()
                .from(DBEducationalQualification.class)
                .queryList();

        return EducationalQualificationConverter.convertStorageListToDomainModel(dbEducationalQualifications);
    }

    @Override
    public List<EducationalQualification> getAllUnsyncedEducationalQualification() {
        return null;
    }

    @Override
    public void markSynced(List<EducationalQualification> configurations) {

    }
}
