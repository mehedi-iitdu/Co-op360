package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.BankHead;

import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public interface BankHeadRepository {

    void insert(BankHead bankHead);

    void update(BankHead bankHead);

    BankHead getBankHeadById(int id);

    List<BankHead> getAllBankHeads();

    List<BankHead> getAllUnsyncedBankHeads();

    void markSynced(List<BankHead> bankHeads);

    void delete(BankHead bankHead);
}
