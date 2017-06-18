package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.storage.model.DBSaving;
import com.datasoft.co_op360.domain.model.Saving;
import com.datasoft.co_op360.network.model.RESTSaving;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public class SavingModelConverter {

    public static Saving convertRestToDoaminModel(RESTSaving restSaving) {

        Saving saving = new Saving();
        saving.setId(restSaving.getId());
        saving.setCode(restSaving.getCode());
        saving.setSid(restSaving.getSid());
        saving.setMid(restSaving.getMid());
        saving.setSPid(restSaving.getSPid());
        saving.setWk(restSaving.getWk());
        saving.setBal(restSaving.getBal());
        saving.setIsAuto(restSaving.getIsAuto());

        return saving;
    }

    public static RESTSaving convertDomainToRestModel(Saving saving) {

        RESTSaving restSaving = new RESTSaving();
        restSaving.setId(saving.getId());
        restSaving.setCode(saving.getCode());
        restSaving.setSid(saving.getSid());
        restSaving.setMid(saving.getMid());
        restSaving.setSPid(saving.getSPid());
        restSaving.setWk(saving.getWk());
        restSaving.setBal(saving.getBal());
        restSaving.setIsAuto(saving.getIsAuto());

        return restSaving;
    }

    public static DBSaving convertDomainToStorageModel(Saving saving) {

        DBSaving dbSaving = new DBSaving();
        dbSaving.setId(saving.getId());
        dbSaving.setCode(saving.getCode());
        dbSaving.setSid(saving.getSid());
        dbSaving.setMid(saving.getMid());
        dbSaving.setSPid(saving.getSPid());
        dbSaving.setWk(saving.getWk());
        dbSaving.setBal(saving.getBal());
        dbSaving.setIsAuto(saving.getIsAuto());

        return dbSaving;
    }

    public static Saving convertStorageToDomainModel(DBSaving dbSaving) {

        Saving saving = new Saving();
        saving.setId(dbSaving.getId());
        saving.setCode(dbSaving.getCode());
        saving.setSid(dbSaving.getSid());
        saving.setMid(dbSaving.getMid());
        saving.setSPid(dbSaving.getSPid());
        saving.setWk(dbSaving.getWk());
        saving.setBal(dbSaving.getBal());
        saving.setIsAuto(dbSaving.getIsAuto());

        return saving;
    }


    public static List<Saving> convertRestListToDoaminModel(List<RESTSaving> restSavings) {

        List<Saving> savings = new ArrayList<>();

        for (RESTSaving rest : restSavings) {
            savings.add(convertRestToDoaminModel(rest));
        }

        // cleanup
        restSavings.clear();

        return savings;
    }

    public static List<RESTSaving> convertDomainListToRestModel(List<Saving> savings) {

        List<RESTSaving> restSavings = new ArrayList<>();

        for (Saving saving : savings) {
            restSavings.add(convertDomainToRestModel(saving));
        }

        // cleanup
        savings.clear();

        return restSavings;
    }

    public static List<DBSaving> convertDomainListToStorageModel(List<Saving> savings) {

        List<DBSaving> dbSavings = new ArrayList<>();

        for (Saving saving : savings) {
            dbSavings.add(convertDomainToStorageModel(saving));
        }

        // cleanup
        savings.clear();

        return dbSavings;
    }


    public static List<Saving> convertStorageListToDomainModel(List<DBSaving> dbSavings) {

        List<Saving> savings = new ArrayList<>();

        for (DBSaving dbSaving : dbSavings) {
            savings.add(convertStorageToDomainModel(dbSaving));
        }

        // cleanup
        dbSavings.clear();

        return savings;
    }
}
