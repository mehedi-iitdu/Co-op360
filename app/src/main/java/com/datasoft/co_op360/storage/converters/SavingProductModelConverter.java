package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.storage.model.DBSavingProduct;
import com.datasoft.co_op360.domain.model.SavingProduct;
import com.datasoft.co_op360.network.model.RESTSavingProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public class SavingProductModelConverter {

    public static SavingProduct convertRestToDoaminModel(RESTSavingProduct restSavingProduct) {

        SavingProduct savingProduct = new SavingProduct();
        savingProduct.setId(restSavingProduct.getId());
        savingProduct.setName(restSavingProduct.getName());
        savingProduct.setTypeOfDeposit(restSavingProduct.getTypeOfDeposit());
        savingProduct.setSavingCollectionFrequency(restSavingProduct.getSavingCollectionFrequency());

        return savingProduct;
    }

    public static RESTSavingProduct convertDomainToRestModel(SavingProduct savingProduct) {

        RESTSavingProduct restSavingProduct = new RESTSavingProduct();
        restSavingProduct.setId(savingProduct.getId());
        restSavingProduct.setName(savingProduct.getName());
        restSavingProduct.setTypeOfDeposit(savingProduct.getTypeOfDeposit());
        restSavingProduct.setSavingCollectionFrequency(restSavingProduct.getSavingCollectionFrequency());

        return restSavingProduct;
    }

    public static DBSavingProduct convertDomainToStorageModel(SavingProduct savingProduct) {

        DBSavingProduct dbSavingProduct = new DBSavingProduct();
        dbSavingProduct.setId(savingProduct.getId());
        dbSavingProduct.setName(savingProduct.getName());
        dbSavingProduct.setTypeOfDeposit(savingProduct.getTypeOfDeposit());
        dbSavingProduct.setSavingCollectionFrequency(dbSavingProduct.getSavingCollectionFrequency());

        return dbSavingProduct;
    }

    public static SavingProduct convertStorageToDomainModel(DBSavingProduct dbSavingProduct) {

        SavingProduct savingProduct = new SavingProduct();
        savingProduct.setId(dbSavingProduct.getId());
        savingProduct.setName(dbSavingProduct.getName());
        savingProduct.setTypeOfDeposit(dbSavingProduct.getTypeOfDeposit());
        savingProduct.setSavingCollectionFrequency(dbSavingProduct.getSavingCollectionFrequency());

        return savingProduct;
    }


    public static List<SavingProduct> convertRestListToDoaminModel(List<RESTSavingProduct> restSavingProductList) {

        List<SavingProduct> savingProducts = new ArrayList<>();

        for (RESTSavingProduct rest : restSavingProductList) {
            savingProducts.add(convertRestToDoaminModel(rest));
        }

        // cleanup
        restSavingProductList.clear();

        return savingProducts;
    }

    public static List<RESTSavingProduct> convertDomainListToRestModel(List<SavingProduct> savingProducts) {

        List<RESTSavingProduct> restSavingProducts = new ArrayList<>();

        for (SavingProduct saving : savingProducts) {
            restSavingProducts.add(convertDomainToRestModel(saving));
        }

        // cleanup
        savingProducts.clear();

        return restSavingProducts;
    }

    public static List<DBSavingProduct> convertDomainListToStorageModel(List<SavingProduct> savingProducts) {

        List<DBSavingProduct> dbSavingProducts = new ArrayList<>();

        for (SavingProduct savingProduct : savingProducts) {
            dbSavingProducts.add(convertDomainToStorageModel(savingProduct));
        }

        // cleanup
        savingProducts.clear();

        return dbSavingProducts;
    }


    public static List<SavingProduct> convertStorageListToDomainModel(List<DBSavingProduct> dbSavingProducts) {

        List<SavingProduct> savingProducts = new ArrayList<>();

        for (DBSavingProduct dbSaving : dbSavingProducts) {
            savingProducts.add(convertStorageToDomainModel(dbSaving));
        }

        // cleanup
        dbSavingProducts.clear();

        return savingProducts;
    }
}
