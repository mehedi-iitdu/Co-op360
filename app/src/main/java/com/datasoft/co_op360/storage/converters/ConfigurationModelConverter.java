package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.Configuration;
import com.datasoft.co_op360.network.model.RESTConfiguration;
import com.datasoft.co_op360.storage.model.DBConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/3/17.
 */

public class ConfigurationModelConverter {

    public static Configuration convertRestToDomainModel(RESTConfiguration restConfiguration) {

        Configuration configuration = new Configuration();
        configuration.setId(restConfiguration.getId());
        configuration.setPurpose(restConfiguration.getPurpose());
        configuration.setLabel(restConfiguration.getLabel());
        configuration.setValue(restConfiguration.getValue());
        configuration.setIsRequired(restConfiguration.getIsRequired());

        return configuration;
    }

    public static RESTConfiguration convertDomainToNetworkModel(Configuration configuration) {
        RESTConfiguration restConfiguration = new RESTConfiguration();
        restConfiguration.setId(configuration.getId());
        restConfiguration.setPurpose(configuration.getPurpose());
        restConfiguration.setLabel(configuration.getLabel());
        restConfiguration.setValue(configuration.getValue());
        restConfiguration.setIsRequired(configuration.getIsRequired());

        return restConfiguration;
    }

    public static DBConfiguration convertDomainToStorageModel(Configuration configuration) {
        DBConfiguration dbConfiguration = new DBConfiguration();
        dbConfiguration.setId(configuration.getId());
        dbConfiguration.setPurpose(configuration.getPurpose());
        dbConfiguration.setLabel(configuration.getLabel());
        dbConfiguration.setValue(configuration.getValue());
        dbConfiguration.setIsRequired(configuration.getIsRequired());

        return dbConfiguration;
    }

    public static Configuration convertStorageToDomainModel(DBConfiguration dbConfiguration) {
        Configuration configuration = new Configuration();
        configuration.setId(dbConfiguration.getId());
        configuration.setPurpose(dbConfiguration.getPurpose());
        configuration.setLabel(dbConfiguration.getLabel());
        configuration.setValue(dbConfiguration.getValue());
        configuration.setIsRequired(dbConfiguration.getIsRequired());

        return configuration;
    }


    public static List<Configuration> convertRestListToDomainModel(List<RESTConfiguration> restConfigurations) {

        List<Configuration> configurations = new ArrayList<>();

        for (RESTConfiguration restConfiguration : restConfigurations) {
            configurations.add(convertRestToDomainModel(restConfiguration));
        }

        // cleanup
        restConfigurations.clear();

        return configurations;
    }

    public static List<RESTConfiguration> convertDomainListToNetworkModel(List<Configuration> configurations) {

        List<RESTConfiguration> restConfigurations = new ArrayList<>();

        for (Configuration configuration : configurations) {
            restConfigurations.add(convertDomainToNetworkModel(configuration));
        }

        // cleanup
        configurations.clear();

        return restConfigurations;
    }

    public static List<DBConfiguration> convertDomainListToStorageModel(List<Configuration> configurations) {

        List<DBConfiguration> dbConfigurations = new ArrayList<>();

        for (Configuration configuration : configurations) {
            dbConfigurations.add(convertDomainToStorageModel(configuration));
        }

        // cleanup
        configurations.clear();

        return dbConfigurations;
    }


    public static List<Configuration> convertStorageListToDomainModel(List<DBConfiguration> dbConfigurations) {

        List<Configuration> configurations = new ArrayList<>();

        for (DBConfiguration dbConfiguration : dbConfigurations) {
            configurations.add(convertStorageToDomainModel(dbConfiguration));
        }

        // cleanup
        dbConfigurations.clear();

        return configurations;
    }
}
