package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.SavingProduct;

import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public interface SavingProductRepository {

    void insert(SavingProduct savingProduct);

    void update(SavingProduct savingProduct);

    SavingProduct getSavingProductById(int id);

    List<SavingProduct> getAllSavingProducts();

    List<SavingProduct> getAllUnsyncedSavingProducts();

    void markSynced(List<SavingProduct> savingProducts);

    void delete(SavingProduct savingProduct);
}
