package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.Samity;

import java.util.List;

/**
 * Created by mehedi on 6/14/17.
 */

public interface SamityRepository {

    void insert(Samity samity);

    void update(Samity samity);

    Samity getSamityById(int id);

    List<Samity> getSamityListByDay(String day);

    List<Samity> getAllSamities();

    void delete(Samity samity);
}
