package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.LoanPurpose;
import com.datasoft.co_op360.storage.model.DBLoanPurpose;
import com.datasoft.co_op360.network.model.RESTLoanPurpose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanPurposeModelConverter {

    public static LoanPurpose convertRestToDomainModel(RESTLoanPurpose restLoanPurpose) {

        LoanPurpose loanPurpose = new LoanPurpose();
        loanPurpose.setId(restLoanPurpose.getId());
        loanPurpose.setName(restLoanPurpose.getName());
        loanPurpose.setCode(restLoanPurpose.getCode());
        loanPurpose.setLoanPurposeCategoryId(restLoanPurpose.getLoanPurposeCategoryId());
        loanPurpose.setIsChild(restLoanPurpose.getIsChild());
        loanPurpose.setParentId(restLoanPurpose.getParentId());

        return loanPurpose;
    }

    public static RESTLoanPurpose convertDomainToRestModel(LoanPurpose loanPurpose) {

        RESTLoanPurpose restLoanPurpose = new RESTLoanPurpose();
        restLoanPurpose.setId(loanPurpose.getId());
        restLoanPurpose.setName(loanPurpose.getName());
        restLoanPurpose.setCode(loanPurpose.getCode());
        restLoanPurpose.setLoanPurposeCategoryId(loanPurpose.getLoanPurposeCategoryId());
        restLoanPurpose.setIsChild(loanPurpose.getIsChild());
        restLoanPurpose.setParentId(loanPurpose.getParentId());

        return restLoanPurpose;
    }

    public static DBLoanPurpose convertDomainToStorageModel(LoanPurpose loanPurpose) {

        DBLoanPurpose dbLoanPurpose = new DBLoanPurpose();
        dbLoanPurpose.setId(loanPurpose.getId());
        dbLoanPurpose.setName(loanPurpose.getName());
        dbLoanPurpose.setCode(loanPurpose.getCode());
        dbLoanPurpose.setLoanPurposeCategoryId(loanPurpose.getLoanPurposeCategoryId());
        dbLoanPurpose.setIsChild(loanPurpose.getIsChild());
        dbLoanPurpose.setParentId(loanPurpose.getParentId());

        return dbLoanPurpose;
    }

    public static LoanPurpose convertStorageToDomainModel(DBLoanPurpose dbLoanPurpose) {

        LoanPurpose loanPurpose = new LoanPurpose();
        loanPurpose.setId(dbLoanPurpose.getId());
        loanPurpose.setName(dbLoanPurpose.getName());
        loanPurpose.setCode(dbLoanPurpose.getCode());
        loanPurpose.setLoanPurposeCategoryId(dbLoanPurpose.getLoanPurposeCategoryId());
        loanPurpose.setIsChild(dbLoanPurpose.getIsChild());
        loanPurpose.setParentId(dbLoanPurpose.getParentId());

        return loanPurpose;
    }


    public static List<LoanPurpose> convertRestListToDomainModel(List<RESTLoanPurpose> restLoanPurposes) {

        List<LoanPurpose> loanPurposes = new ArrayList<>();

        for (RESTLoanPurpose rest : restLoanPurposes) {
            loanPurposes.add(convertRestToDomainModel(rest));
        }

        // cleanup
        restLoanPurposes.clear();

        return loanPurposes;
    }

    public static List<RESTLoanPurpose> convertDomainListToRestModel(List<LoanPurpose> loanPurposes) {

        List<RESTLoanPurpose> restLoanPurposes = new ArrayList<>();

        for (LoanPurpose loanPurpose : loanPurposes) {
            restLoanPurposes.add(convertDomainToRestModel(loanPurpose));
        }

        // cleanup
        loanPurposes.clear();

        return restLoanPurposes;
    }

    public static List<DBLoanPurpose> convertDomainListToStorageModel(List<LoanPurpose> loanPurposes) {

        List<DBLoanPurpose> dbLoanPurposes = new ArrayList<>();

        for (LoanPurpose loanPurpose : loanPurposes) {
            dbLoanPurposes.add(convertDomainToStorageModel(loanPurpose));
        }

        // cleanup
        loanPurposes.clear();

        return dbLoanPurposes;
    }


    public static List<LoanPurpose> convertStorageListToDomainModel(List<DBLoanPurpose> dbLoanPurposes) {

        List<LoanPurpose> loanPurposes = new ArrayList<>();

        for (DBLoanPurpose db : dbLoanPurposes) {
            loanPurposes.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbLoanPurposes.clear();

        return loanPurposes;
    }
}
