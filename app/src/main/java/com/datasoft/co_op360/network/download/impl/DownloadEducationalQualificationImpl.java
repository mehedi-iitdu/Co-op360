package com.datasoft.co_op360.network.download.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.EducationalQualificationRepository;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.response.EducationalQualificationResponse;
import com.datasoft.co_op360.network.services.EducationalQualificationApiInterface;
import com.datasoft.co_op360.storage.EducationalQualificationRepositoryImpl;
import com.datasoft.co_op360.storage.converters.EducationalQualificationConverter;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.network.download.DownloadEducationalQualification;
import com.datasoft.co_op360.network.model.RESTEducationalQualification;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/5/17.
 */

public class DownloadEducationalQualificationImpl extends AbstractInteractor {

    private String mApi_key;
    DownloadEducationalQualification.CallBack mCallback;
    EducationalQualificationApiInterface apiService;

    public DownloadEducationalQualificationImpl(Executor threadExecutor, MainThread mainThread, DownloadEducationalQualification.CallBack callback, String api_key) {
        super(threadExecutor, mainThread);
        mApi_key = api_key;
        mCallback = callback;    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(EducationalQualificationApiInterface.class);
        Call<EducationalQualificationResponse> call = apiService.getEducationalQualifications(mApi_key);

        call.enqueue(new Callback<EducationalQualificationResponse>() {
            @Override
            public void onResponse(Call<EducationalQualificationResponse> call, Response<EducationalQualificationResponse> response) {

                EducationalQualificationRepository educationalQualificationRepository = new EducationalQualificationRepositoryImpl();
                for (RESTEducationalQualification rest : response.body().getEducationalQualifications()) {
                    educationalQualificationRepository.insert(EducationalQualificationConverter.convertRestToDomianModel(rest));
                }

                mCallback.onEducationalQualificationDownloaded();
            }

            @Override
            public void onFailure(Call<EducationalQualificationResponse> call, Throwable t) {

                mCallback.onEducationalQualificationDownloadError();
            }
        });
    }
}
