package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.EducationalQualification;
import com.datasoft.co_op360.storage.model.DBEducationalQualification;
import com.datasoft.co_op360.network.model.RESTEducationalQualification;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public class EducationalQualificationConverter {

    public static EducationalQualification convertRestToDomianModel(RESTEducationalQualification restEducationalQualification) {

        EducationalQualification educationalQualification = new EducationalQualification();
        educationalQualification.setId(restEducationalQualification.getId());
        educationalQualification.setName(restEducationalQualification.getName());

        return educationalQualification;
    }

    public static RESTEducationalQualification convertDomainToRestModel(EducationalQualification educationalQualification) {

        RESTEducationalQualification restEducationalQualification = new RESTEducationalQualification();
        restEducationalQualification.setId(educationalQualification.getId());
        restEducationalQualification.setName(educationalQualification.getName());
        return restEducationalQualification;
    }

    public static DBEducationalQualification convertDomainToStorageModel(EducationalQualification educationalQualification) {

        DBEducationalQualification dbEducationalQualification = new DBEducationalQualification();
        dbEducationalQualification.setId(educationalQualification.getId());
        dbEducationalQualification.setName(educationalQualification.getName());
        return dbEducationalQualification;
    }

    public static EducationalQualification convertStorageToDomainModel(DBEducationalQualification dbEducationalQualification) {

        EducationalQualification educationalQualification = new EducationalQualification();
        educationalQualification.setId(educationalQualification.getId());
        educationalQualification.setName(educationalQualification.getName());
        return educationalQualification;
    }


    public static List<EducationalQualification> convertRestListToDomainModel(List<RESTEducationalQualification> restEducationalQualifications) {

        List<EducationalQualification> educationalQualifications = new ArrayList<>();

        for (RESTEducationalQualification rest : restEducationalQualifications) {
            educationalQualifications.add(convertRestToDomianModel(rest));
        }

        // cleanup
        restEducationalQualifications.clear();

        return educationalQualifications;
    }

    public static List<RESTEducationalQualification> convertDomainListToRestModel(List<EducationalQualification> educationalQualifications) {

        List<RESTEducationalQualification> restEducationalQualifications = new ArrayList<>();

        for (EducationalQualification educationalQualification : educationalQualifications) {
            restEducationalQualifications.add(convertDomainToRestModel(educationalQualification));
        }

        // cleanup
        educationalQualifications.clear();

        return restEducationalQualifications;
    }

    public static List<DBEducationalQualification> convertDomainListToStorageModel(List<EducationalQualification> educationalQualifications) {

        List<DBEducationalQualification> dbEducationalQualifications = new ArrayList<>();

        for (EducationalQualification educationalQualification : educationalQualifications) {
            dbEducationalQualifications.add(convertDomainToStorageModel(educationalQualification));
        }

        // cleanup
        educationalQualifications.clear();

        return dbEducationalQualifications;
    }


    public static List<EducationalQualification> convertStorageListToDomainModel(List<DBEducationalQualification> dbEducationalQualifications) {

        List<EducationalQualification> educationalQualifications = new ArrayList<>();

        for (DBEducationalQualification db : dbEducationalQualifications) {
            educationalQualifications.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbEducationalQualifications.clear();

        return educationalQualifications;
    }
}
