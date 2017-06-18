package com.datasoft.co_op360.network.download.impl;

import com.datasoft.co_op360.domain.repository.ConfigurationRepository;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadConfiguration;
import com.datasoft.co_op360.network.model.RESTConfiguration;
import com.datasoft.co_op360.network.response.ConfigurationResponse;
import com.datasoft.co_op360.network.services.ConfigurationApiInterface;
import com.datasoft.co_op360.storage.ConfigurationRepositoryImpl;
import com.datasoft.co_op360.storage.converters.ConfigurationModelConverter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/3/17.
 */

public class DownloadConfigurationImpl extends AbstractInteractor {

    private String mApi_key;
    DownloadConfiguration.CallBack mCallback;
    ConfigurationApiInterface apiService;

    public DownloadConfigurationImpl(Executor threadExecutor, MainThread mainThread, DownloadConfiguration.CallBack callback, String api_key) {
        super(threadExecutor, mainThread);
        mApi_key = api_key;
        mCallback = callback;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(ConfigurationApiInterface.class);
        Call<ConfigurationResponse> call = apiService.getConfigurations(mApi_key);

        call.enqueue(new Callback<ConfigurationResponse>() {
            @Override
            public void onResponse(Call<ConfigurationResponse> call, Response<ConfigurationResponse> response) {

                ConfigurationRepository configurationRepository = new ConfigurationRepositoryImpl();

                for (RESTConfiguration rest : response.body().getConfigurations()) {
                    configurationRepository.insert(ConfigurationModelConverter.convertRestToDomainModel(rest));
                }

                mCallback.onConfigurationDownloaded();
            }

            @Override
            public void onFailure(Call<ConfigurationResponse> call, Throwable t) {

                mCallback.onConfigurationDownloadError();
            }
        });

    }
}
