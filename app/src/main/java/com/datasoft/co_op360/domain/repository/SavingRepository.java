package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.Saving;

import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public interface SavingRepository {

    void insert(Saving saving);

    void update(Saving saving);

    Saving getSavingById(int id);

    List<Saving> getAllSavings();

    List<Saving> getAllUnsyncedSavings();

    void markSynced(List<Saving> savings);

    void delete(Saving saving);
}
