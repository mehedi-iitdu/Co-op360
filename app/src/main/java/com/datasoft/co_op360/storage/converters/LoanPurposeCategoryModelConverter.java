package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.LoanPurposeCategory;
import com.datasoft.co_op360.storage.model.DBLoanPurposeCategory;
import com.datasoft.co_op360.network.model.RESTLoanPurposeCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/7/17.
 */

public class LoanPurposeCategoryModelConverter {

    public static LoanPurposeCategory convertRestToDomainModel(RESTLoanPurposeCategory restLoanPurposeCategory) {

        LoanPurposeCategory loanPurposeCategory = new LoanPurposeCategory();
        loanPurposeCategory.setId(restLoanPurposeCategory.getId());
        loanPurposeCategory.setName(restLoanPurposeCategory.getName());

        return loanPurposeCategory;
    }

    public static RESTLoanPurposeCategory convertDomainToRestModel(LoanPurposeCategory loanPurposeCategory) {

        RESTLoanPurposeCategory restLoanPurposeCategory = new RESTLoanPurposeCategory();
        restLoanPurposeCategory.setId(loanPurposeCategory.getId());
        restLoanPurposeCategory.setName(loanPurposeCategory.getName());

        return restLoanPurposeCategory;
    }

    public static DBLoanPurposeCategory convertDomainToStorageModel(LoanPurposeCategory loanPurposeCategory) {

        DBLoanPurposeCategory dbLoanPurposeCategory = new DBLoanPurposeCategory();
        dbLoanPurposeCategory.setId(loanPurposeCategory.getId());
        dbLoanPurposeCategory.setName(loanPurposeCategory.getName());

        return dbLoanPurposeCategory;
    }

    public static LoanPurposeCategory convertStorageToDomainModel(DBLoanPurposeCategory dbLoanPurposeCategory) {

        LoanPurposeCategory loanPurposeCategory = new LoanPurposeCategory();
        loanPurposeCategory.setId(dbLoanPurposeCategory.getId());
        loanPurposeCategory.setName(dbLoanPurposeCategory.getName());

        return loanPurposeCategory;
    }


    public static List<LoanPurposeCategory> convertRestListToDomainModel(List<RESTLoanPurposeCategory> restLoanPurposeCategories) {

        List<LoanPurposeCategory> loanPurposeCategories = new ArrayList<>();

        for (RESTLoanPurposeCategory rest : restLoanPurposeCategories) {
            loanPurposeCategories.add(convertRestToDomainModel(rest));
        }

        // cleanup
        restLoanPurposeCategories.clear();

        return loanPurposeCategories;
    }

    public static List<RESTLoanPurposeCategory> convertDomainListToRestModel(List<LoanPurposeCategory> loanPurposeCategories) {

        List<RESTLoanPurposeCategory> restLoanPurposeCategories = new ArrayList<>();

        for (LoanPurposeCategory loanPurposeCategory : loanPurposeCategories) {
            restLoanPurposeCategories.add(convertDomainToRestModel(loanPurposeCategory));
        }

        // cleanup
        loanPurposeCategories.clear();

        return restLoanPurposeCategories;
    }

    public static List<DBLoanPurposeCategory> convertDomainListToStorageModel(List<LoanPurposeCategory> loanPurposeCategories) {

        List<DBLoanPurposeCategory> dbLoanPurposeCategories = new ArrayList<>();

        for (LoanPurposeCategory loanPurposeCategory : loanPurposeCategories) {
            dbLoanPurposeCategories.add(convertDomainToStorageModel(loanPurposeCategory));
        }

        // cleanup
        loanPurposeCategories.clear();

        return dbLoanPurposeCategories;
    }


    public static List<LoanPurposeCategory> convertStorageListToDomainModel(List<DBLoanPurposeCategory> dbLoanPurposeCategories) {

        List<LoanPurposeCategory> loanPurposeCategories = new ArrayList<>();

        for (DBLoanPurposeCategory db : dbLoanPurposeCategories) {
            loanPurposeCategories.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbLoanPurposeCategories.clear();

        return loanPurposeCategories;
    }
}
