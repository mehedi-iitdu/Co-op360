package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.network.model.RESTLoanProduct;
import com.datasoft.co_op360.storage.model.DBLoanProduct;
import com.datasoft.co_op360.domain.model.LoanProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanProductModelConverter {

    public static LoanProduct convertRestToDomainModel(RESTLoanProduct restLoanProduct) {

        LoanProduct loanProduct = new LoanProduct();
        loanProduct.setId(restLoanProduct.getId());
        loanProduct.setName(restLoanProduct.getName());
        loanProduct.setCatId(restLoanProduct.getCatId());
        loanProduct.setCatName(restLoanProduct.getCatName());
        loanProduct.setMomc(restLoanProduct.getMomc());
        loanProduct.setIsPrimary(restLoanProduct.getIsPrimary());
        loanProduct.setAdmsnFee(restLoanProduct.getAdmsnFee());
        loanProduct.setFormFee(restLoanProduct.getFormFee());
        loanProduct.setHealthExp(restLoanProduct.getHealthExp());
        loanProduct.setRiskFee(restLoanProduct.getRiskFee());
        loanProduct.setMinAmt(restLoanProduct.getMinAmt());
        loanProduct.setMaxAmt(restLoanProduct.getMaxAmt());

        return loanProduct;
    }

    public static RESTLoanProduct convertDomainToRestModel(LoanProduct loanProduct) {

        RESTLoanProduct restLoanProduct = new RESTLoanProduct();
        restLoanProduct.setId(loanProduct.getId());
        restLoanProduct.setName(loanProduct.getName());
        restLoanProduct.setCatId(loanProduct.getCatId());
        restLoanProduct.setCatName(loanProduct.getCatName());
        restLoanProduct.setMomc(loanProduct.getMomc());
        restLoanProduct.setIsPrimary(loanProduct.getIsPrimary());
        restLoanProduct.setAdmsnFee(loanProduct.getAdmsnFee());
        restLoanProduct.setFormFee(loanProduct.getFormFee());
        restLoanProduct.setHealthExp(loanProduct.getHealthExp());
        restLoanProduct.setRiskFee(loanProduct.getRiskFee());
        restLoanProduct.setMinAmt(loanProduct.getMinAmt());
        restLoanProduct.setMaxAmt(loanProduct.getMaxAmt());

        return restLoanProduct;
    }

    public static DBLoanProduct convertDomainToStorageModel(LoanProduct loanProduct) {

        DBLoanProduct dbLoanProduct = new DBLoanProduct();
        dbLoanProduct.setId(loanProduct.getId());
        dbLoanProduct.setName(loanProduct.getName());
        dbLoanProduct.setCatId(loanProduct.getCatId());
        dbLoanProduct.setCatName(loanProduct.getCatName());
        dbLoanProduct.setMomc(loanProduct.getMomc());
        dbLoanProduct.setIsPrimary(loanProduct.getIsPrimary());
        dbLoanProduct.setAdmsnFee(loanProduct.getAdmsnFee());
        dbLoanProduct.setFormFee(loanProduct.getFormFee());
        dbLoanProduct.setHealthExp(loanProduct.getHealthExp());
        dbLoanProduct.setRiskFee(loanProduct.getRiskFee());
        dbLoanProduct.setMinAmt(loanProduct.getMinAmt());
        dbLoanProduct.setMaxAmt(loanProduct.getMaxAmt());

        return dbLoanProduct;
    }

    public static LoanProduct convertStorageToDomainModel(DBLoanProduct dbLoanProduct) {

        LoanProduct loanProduct = new LoanProduct();
        loanProduct.setId(dbLoanProduct.getId());
        loanProduct.setName(dbLoanProduct.getName());
        loanProduct.setCatId(dbLoanProduct.getCatId());
        loanProduct.setCatName(dbLoanProduct.getCatName());
        loanProduct.setMomc(dbLoanProduct.getMomc());
        loanProduct.setIsPrimary(dbLoanProduct.getIsPrimary());
        loanProduct.setAdmsnFee(dbLoanProduct.getAdmsnFee());
        loanProduct.setFormFee(dbLoanProduct.getFormFee());
        loanProduct.setHealthExp(dbLoanProduct.getHealthExp());
        loanProduct.setRiskFee(dbLoanProduct.getRiskFee());
        loanProduct.setMinAmt(dbLoanProduct.getMinAmt());
        loanProduct.setMaxAmt(dbLoanProduct.getMaxAmt());

        return loanProduct;
    }


    public static List<LoanProduct> convertRestListToDomainModel(List<RESTLoanProduct> restLoanProducts) {

        List<LoanProduct> loanProducts = new ArrayList<>();

        for (RESTLoanProduct rest : restLoanProducts) {
            loanProducts.add(convertRestToDomainModel(rest));
        }

        // cleanup
        restLoanProducts.clear();

        return loanProducts;
    }

    public static List<RESTLoanProduct> convertDomainListToRestModel(List<LoanProduct> loanProducts) {

        List<RESTLoanProduct> restLoanProducts = new ArrayList<>();

        for (LoanProduct loanProduct : loanProducts) {
            restLoanProducts.add(convertDomainToRestModel(loanProduct));
        }

        // cleanup
        loanProducts.clear();

        return restLoanProducts;
    }

    public static List<DBLoanProduct> convertDomainListToStorageModel(List<LoanProduct> loanProducts) {

        List<DBLoanProduct> dbLoanProducts = new ArrayList<>();

        for (LoanProduct loanProduct : loanProducts) {
            dbLoanProducts.add(convertDomainToStorageModel(loanProduct));
        }

        // cleanup
        loanProducts.clear();

        return dbLoanProducts;
    }


    public static List<LoanProduct> convertStorageListToDomainModel(List<DBLoanProduct> dbLoanProducts) {

        List<LoanProduct> loanProducts = new ArrayList<>();

        for (DBLoanProduct db : dbLoanProducts) {
            loanProducts.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbLoanProducts.clear();

        return loanProducts;
    }
}
