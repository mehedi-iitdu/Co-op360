package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.network.model.RESTSamity;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.storage.model.DBSamity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/14/17.
 */

public class SamityModelConveter {

    public static Samity convertRestToDoaminModel(RESTSamity restSamity) {

        Samity samity = new Samity();
        samity.setId(restSamity.getId());
        samity.setWorkingAreaId(restSamity.getWorkingAreaId());
        samity.setName(restSamity.getName());
        samity.setCode(restSamity.getCode());
        samity.setSamityDay(restSamity.getSamityDay());
        samity.setType(restSamity.getType());
        samity.setLat(restSamity.getLat());
        samity.setLng(restSamity.getLng());
        samity.setIsdo(restSamity.getIsdo());

        return samity;
    }

    public static RESTSamity convertDomainToRestModel(Samity samity) {

        RESTSamity restSamity = new RESTSamity();
        restSamity.setId(samity.getId());
        restSamity.setWorkingAreaId(samity.getWorkingAreaId());
        restSamity.setName(samity.getName());
        restSamity.setCode(samity.getCode());
        restSamity.setSamityDay(samity.getSamityDay());
        restSamity.setType(samity.getType());
        restSamity.setLat(samity.getLat());
        restSamity.setLng(samity.getLng());
        restSamity.setIsdo(samity.getIsdo());

        return restSamity;
    }

    public static DBSamity convertDomainToStorageModel(Samity samity) {

        DBSamity dbSamity = new DBSamity();
        dbSamity.setId(samity.getId());
        dbSamity.setWorkingAreaId(samity.getWorkingAreaId());
        dbSamity.setName(samity.getName());
        dbSamity.setCode(samity.getCode());
        dbSamity.setSamityDay(samity.getSamityDay());
        dbSamity.setType(samity.getType());
        dbSamity.setLat(samity.getLat());
        dbSamity.setLng(samity.getLng());
        dbSamity.setIsdo(samity.getIsdo());

        return dbSamity;
    }

    public static Samity convertStorageToDomainModel(DBSamity dbSamity) {

        Samity samity = new Samity();
        samity.setId(dbSamity.getId());
        samity.setWorkingAreaId(dbSamity.getWorkingAreaId());
        samity.setName(dbSamity.getName());
        samity.setCode(dbSamity.getCode());
        samity.setSamityDay(dbSamity.getSamityDay());
        samity.setType(dbSamity.getType());
        samity.setLat(dbSamity.getLat());
        samity.setLng(dbSamity.getLng());
        samity.setIsdo(dbSamity.getIsdo());

        return samity;
    }


    public static List<Samity> convertRestListToDoaminModel(List<RESTSamity> restSamities) {

        List<Samity> samities = new ArrayList<>();

        for (RESTSamity rest : restSamities) {
            samities.add(convertRestToDoaminModel(rest));
        }

        // cleanup
        restSamities.clear();

        return samities;
    }

    public static List<RESTSamity> convertDomainListToRestModel(List<Samity> samities) {

        List<RESTSamity> restSamities = new ArrayList<>();

        for (Samity samity : samities) {
            restSamities.add(convertDomainToRestModel(samity));
        }

        // cleanup
        samities.clear();

        return restSamities;
    }

    public static List<DBSamity> convertDomainListToStorageModel(List<Samity> samities) {

        List<DBSamity> dbSamities = new ArrayList<>();

        for (Samity samity : samities) {
            dbSamities.add(convertDomainToStorageModel(samity));
        }

        // cleanup
        samities.clear();

        return dbSamities;
    }


    public static List<Samity> convertStorageListToDomainModel(List<DBSamity> dbSamities) {

        List<Samity> samities = new ArrayList<>();

        for (DBSamity dbSamity : dbSamities) {
            samities.add(convertStorageToDomainModel(dbSamity));
        }

        // cleanup
        dbSamities.clear();

        return samities;
    }
}
