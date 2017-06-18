package com.datasoft.co_op360.domain.repository;


import com.datasoft.co_op360.domain.model.EducationalQualification;

import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public interface EducationalQualificationRepository {

    void insert(EducationalQualification educationalQualification);

    void update(EducationalQualification educationalQualification);

    EducationalQualification getEducationalQualificationById(String id);

    List<EducationalQualification> getAllEducationalQualification();

    List<EducationalQualification> getAllUnsyncedEducationalQualification();

    void markSynced(List<EducationalQualification> configurations);
}
