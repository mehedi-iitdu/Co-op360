package com.datasoft.co_op360.network.download.impl;

import android.util.Log;

import com.datasoft.co_op360.network.model.RESTSamity;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.SamityRepository;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadSamity;
import com.datasoft.co_op360.network.response.SamityResponse;
import com.datasoft.co_op360.network.services.SamityApiInterface;
import com.datasoft.co_op360.storage.SamityRepositoryImpl;
import com.datasoft.co_op360.storage.converters.SamityModelConveter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/14/17.
 */

public class DownloadSamityImpl extends AbstractInteractor {

    private String mApi_key;
    private int mFo_id;
    private int mBranch_id;
    DownloadSamity.CallBack mCallback;
    SamityApiInterface apiService;

    public DownloadSamityImpl(Executor threadExecutor, MainThread mainThread, DownloadSamity.CallBack callback, String api_key, int fo_id, int branch_id) {
        super(threadExecutor, mainThread);
        mApi_key = api_key;
        mFo_id = fo_id;
        mBranch_id = branch_id;
        mCallback = callback;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(SamityApiInterface.class);
        Call<SamityResponse> call = apiService.getSamities(mApi_key, mFo_id, mBranch_id);

        call.enqueue(new Callback<SamityResponse>() {
            @Override
            public void onResponse(Call<SamityResponse> call, Response<SamityResponse> response) {

                try {
                    SamityRepository samityRepository = new SamityRepositoryImpl();
                    for (RESTSamity restSamity : response.body().getSamityList()) {
                        samityRepository.insert(SamityModelConveter.convertRestToDoaminModel(restSamity));
                    }
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                } finally {

                    mCallback.onSamityDownloaded();
                }
            }

            @Override
            public void onFailure(Call<SamityResponse> call, Throwable t) {

                mCallback.onSamityDownloadError();
            }
        });

    }
}
