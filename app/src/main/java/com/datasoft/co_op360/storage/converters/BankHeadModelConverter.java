package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.BankHead;
import com.datasoft.co_op360.network.model.RESTBankHead;
import com.datasoft.co_op360.storage.model.DBBankHead;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public class BankHeadModelConverter {

    public static BankHead convertRestToDoaminModel(RESTBankHead restBankHead) {

        BankHead bankHead = new BankHead();
        bankHead.setId(restBankHead.getId());
        bankHead.setName(restBankHead.getName());
        bankHead.setCode(restBankHead.getCode());
        bankHead.setAccountTypeId(restBankHead.getAccountTypeId());
        bankHead.setAccountTypeName(restBankHead.getAccountTypeName());

        return bankHead;
    }

    public static RESTBankHead convertDomainToRestModel(BankHead bankHead) {

        RESTBankHead restBankHead = new RESTBankHead();
        restBankHead.setId(bankHead.getId());
        restBankHead.setName(bankHead.getName());
        restBankHead.setCode(bankHead.getCode());
        restBankHead.setAccountTypeId(bankHead.getAccountTypeId());
        restBankHead.setAccountTypeName(bankHead.getAccountTypeName());

        return restBankHead;
    }

    public static DBBankHead convertDomainToStorageModel(BankHead bankHead) {

        DBBankHead dbBankHead = new DBBankHead();
        dbBankHead.setId(bankHead.getId());
        dbBankHead.setName(bankHead.getName());
        dbBankHead.setCode(bankHead.getCode());
        dbBankHead.setAccountTypeId(bankHead.getAccountTypeId());
        dbBankHead.setAccountTypeName(bankHead.getAccountTypeName());

        return dbBankHead;
    }

    public static BankHead convertStorageToDomainModel(DBBankHead dbSavingProduct) {

        BankHead bankHead = new BankHead();
        bankHead.setId(dbSavingProduct.getId());
        bankHead.setName(dbSavingProduct.getName());
        bankHead.setCode(dbSavingProduct.getCode());
        bankHead.setAccountTypeId(dbSavingProduct.getAccountTypeId());
        bankHead.setAccountTypeName(dbSavingProduct.getAccountTypeName());

        return bankHead;
    }


    public static List<BankHead> convertRestListToDoaminModel(List<RESTBankHead> restBankHeads) {

        List<BankHead> bankHeads = new ArrayList<>();

        for (RESTBankHead restBankHead : restBankHeads) {
            bankHeads.add(convertRestToDoaminModel(restBankHead));
        }

        // cleanup
        restBankHeads.clear();

        return bankHeads;
    }

    public static List<RESTBankHead> convertDomainListToRestModel(List<BankHead> bankHeads) {

        List<RESTBankHead> restBankHeads = new ArrayList<>();

        for (BankHead bankHead : bankHeads) {
            restBankHeads.add(convertDomainToRestModel(bankHead));
        }

        // cleanup
        bankHeads.clear();

        return restBankHeads;
    }

    public static List<DBBankHead> convertDomainListToStorageModel(List<BankHead> bankHeads) {

        List<DBBankHead> dbBankHeads = new ArrayList<>();

        for (BankHead bankHead : bankHeads) {
            dbBankHeads.add(convertDomainToStorageModel(bankHead));
        }

        // cleanup
        bankHeads.clear();

        return dbBankHeads;
    }


    public static List<BankHead> convertStorageListToDomainModel(List<DBBankHead> dbBankHeads) {

        List<BankHead> bankHeads = new ArrayList<>();

        for (DBBankHead dbBankHead : dbBankHeads) {
            bankHeads.add(convertStorageToDomainModel(dbBankHead));
        }

        // cleanup
        dbBankHeads.clear();

        return bankHeads;
    }
}
