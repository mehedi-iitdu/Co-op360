package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.repository.ConfigurationRepository;
import com.datasoft.co_op360.domain.model.Configuration;
import com.datasoft.co_op360.storage.converters.ConfigurationModelConverter;
import com.datasoft.co_op360.storage.model.DBConfiguration;
import com.datasoft.co_op360.storage.model.DBConfiguration_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public class ConfigurationRepositoryImpl implements ConfigurationRepository {

    @Override
    public void insert(Configuration configuration) {

        DBConfiguration dbConfiguration = ConfigurationModelConverter.convertDomainToStorageModel(configuration);
        dbConfiguration.save();
    }

    @Override
    public void update(Configuration configuration) {

        DBConfiguration dbConfiguration = ConfigurationModelConverter.convertDomainToStorageModel(configuration);
        dbConfiguration.update();
    }

    @Override
    public Configuration getConfigurationById(int id) {

        DBConfiguration dbConfiguration = SQLite
                .select()
                .from(DBConfiguration.class)
                .where(DBConfiguration_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return ConfigurationModelConverter.convertStorageToDomainModel(dbConfiguration);
    }

    @Override
    public List<Configuration> getAllConfigurations() {

        List<DBConfiguration> dbConfigurations = SQLite
                .select()
                .from(DBConfiguration.class)
                .queryList();

        return ConfigurationModelConverter.convertStorageListToDomainModel(dbConfigurations);
    }

    @Override
    public List<Configuration> getAllUnsyncedConfigurations() {
        return null;
    }

    @Override
    public void markSynced(List<Configuration> configurations) {

    }
}
