package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.BankHead;
import com.datasoft.co_op360.domain.repository.BankHeadRepository;
import com.datasoft.co_op360.storage.converters.BankHeadModelConverter;
import com.datasoft.co_op360.storage.model.DBBankHead;
import com.datasoft.co_op360.storage.model.DBBankHead_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public class BankHeadRepositoryImpl implements BankHeadRepository {

    @Override
    public void insert(BankHead bankHead) {
        DBBankHead dbBankHead = BankHeadModelConverter.convertDomainToStorageModel(bankHead);
        dbBankHead.save();
    }

    @Override
    public void update(BankHead bankHead) {
        DBBankHead dbBankHead = BankHeadModelConverter.convertDomainToStorageModel(bankHead);
        dbBankHead.update();
    }

    @Override
    public BankHead getBankHeadById(int id) {
        DBBankHead dbBankHead = SQLite
                .select()
                .from(DBBankHead.class)
                .where(DBBankHead_Table.id.eq(String.valueOf(id)))
                .querySingle();
        return BankHeadModelConverter.convertStorageToDomainModel(dbBankHead);
    }

    @Override
    public List<BankHead> getAllBankHeads() {
        List<DBBankHead> dbBankHeads = SQLite
                .select()
                .from(DBBankHead.class)
                .queryList();
        return BankHeadModelConverter.convertStorageListToDomainModel(dbBankHeads);
    }

    @Override
    public List<BankHead> getAllUnsyncedBankHeads() {
        return null;
    }

    @Override
    public void markSynced(List<BankHead> bankHeads) {

    }

    @Override
    public void delete(BankHead bankHead) {
        DBBankHead dbBankHead = BankHeadModelConverter.convertDomainToStorageModel(bankHead);
        dbBankHead.delete();
    }
}
