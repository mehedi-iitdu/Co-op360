package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.Configuration;

import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public interface ConfigurationRepository {

    void insert(Configuration configuration);

    void update(Configuration configuration);

    Configuration getConfigurationById(int id);

    List<Configuration> getAllConfigurations();

    List<Configuration> getAllUnsyncedConfigurations();

    void markSynced(List<Configuration> configurations);

}
