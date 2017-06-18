package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.LoanProductInterestRate;
import com.datasoft.co_op360.network.model.RESTLoanProductInterestRate;
import com.datasoft.co_op360.storage.model.DBLoanProductInterestRate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanProductInterestRateModelConverter {

    public static LoanProductInterestRate convertRestToDomainModel(RESTLoanProductInterestRate rest) {

        LoanProductInterestRate loanProductInterestRate = new LoanProductInterestRate();
        loanProductInterestRate.setId(rest.getId());
        loanProductInterestRate.setPid(rest.getPid());
        loanProductInterestRate.setIr(rest.getIr());
        loanProductInterestRate.setIri(rest.getIri());
        loanProductInterestRate.setIcm(rest.getIcm());
        loanProductInterestRate.setMoi(rest.getMoi());
        loanProductInterestRate.setDp(rest.getDp());

        return loanProductInterestRate;
    }

    public static RESTLoanProductInterestRate convertDomainToRestModel(LoanProductInterestRate loanProductInterestRate) {

        RESTLoanProductInterestRate rest = new RESTLoanProductInterestRate();
        rest.setId(loanProductInterestRate.getId());
        rest.setPid(loanProductInterestRate.getPid());
        rest.setIr(loanProductInterestRate.getIr());
        rest.setIri(loanProductInterestRate.getIri());
        rest.setIcm(loanProductInterestRate.getIcm());
        rest.setMoi(loanProductInterestRate.getMoi());
        rest.setDp(loanProductInterestRate.getDp());

        return rest;
    }

    public static DBLoanProductInterestRate convertDomainToStorageModel(LoanProductInterestRate loanProductInterestRate) {

        DBLoanProductInterestRate db = new DBLoanProductInterestRate();
        db.setId(loanProductInterestRate.getId());
        db.setPid(loanProductInterestRate.getPid());
        db.setIr(loanProductInterestRate.getIr());
        db.setIri(loanProductInterestRate.getIri());
        db.setIcm(loanProductInterestRate.getIcm());
        db.setMoi(loanProductInterestRate.getMoi());
        db.setDp(loanProductInterestRate.getDp());

        return db;
    }

    public static LoanProductInterestRate convertStorageToDomainModel(DBLoanProductInterestRate db) {

        LoanProductInterestRate loanProductInterestRate = new LoanProductInterestRate();
        loanProductInterestRate.setId(db.getId());
        loanProductInterestRate.setPid(db.getPid());
        loanProductInterestRate.setIr(db.getIr());
        loanProductInterestRate.setIri(db.getIri());
        loanProductInterestRate.setIcm(db.getIcm());
        loanProductInterestRate.setMoi(db.getMoi());
        loanProductInterestRate.setDp(db.getDp());

        return loanProductInterestRate;
    }


    public static List<LoanProductInterestRate> convertRestListToDoaminModel(List<RESTLoanProductInterestRate> rests) {

        List<LoanProductInterestRate> loanProductInterestRates = new ArrayList<>();

        for (RESTLoanProductInterestRate rest : rests) {
            loanProductInterestRates.add(convertRestToDomainModel(rest));
        }

        // cleanup
        rests.clear();

        return loanProductInterestRates;
    }

    public static List<RESTLoanProductInterestRate> convertDomainListToRestModel(List<LoanProductInterestRate> loanProductInterestRates) {

        List<RESTLoanProductInterestRate> restLoanProductInterestRates = new ArrayList<>();

        for (LoanProductInterestRate loanProductInterestRate : loanProductInterestRates) {
            restLoanProductInterestRates.add(convertDomainToRestModel(loanProductInterestRate));
        }

        // cleanup
        loanProductInterestRates.clear();

        return restLoanProductInterestRates;
    }

    public static List<DBLoanProductInterestRate> convertDomainListToStorageModel(List<LoanProductInterestRate> loanProductInterestRates) {

        List<DBLoanProductInterestRate> dbLoanProductInterestRates = new ArrayList<>();

        for (LoanProductInterestRate loanProductInterestRate : loanProductInterestRates) {
            dbLoanProductInterestRates.add(convertDomainToStorageModel(loanProductInterestRate));
        }

        // cleanup
        loanProductInterestRates.clear();

        return dbLoanProductInterestRates;
    }


    public static List<LoanProductInterestRate> convertStorageListToDomainModel(List<DBLoanProductInterestRate> dbLoanProductInterestRates) {

        List<LoanProductInterestRate> loanProductInterestRates = new ArrayList<>();

        for (DBLoanProductInterestRate db : dbLoanProductInterestRates) {
            loanProductInterestRates.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbLoanProductInterestRates.clear();

        return loanProductInterestRates;
    }

}
