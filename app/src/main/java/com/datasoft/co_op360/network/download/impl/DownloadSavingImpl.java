package com.datasoft.co_op360.network.download.impl;

import android.util.Log;

import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.BankHeadRepository;
import com.datasoft.co_op360.domain.repository.SavingRepository;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadSaving;
import com.datasoft.co_op360.network.model.RESTBankHead;
import com.datasoft.co_op360.network.model.RESTSavingProduct;
import com.datasoft.co_op360.network.response.SavingResponse;
import com.datasoft.co_op360.storage.converters.BankHeadModelConverter;
import com.datasoft.co_op360.storage.converters.SavingProductModelConverter;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.repository.SavingProductRepository;
import com.datasoft.co_op360.network.model.RESTSaving;
import com.datasoft.co_op360.network.services.SavingApiInterface;
import com.datasoft.co_op360.storage.BankHeadRepositoryImpl;
import com.datasoft.co_op360.storage.SavingProductRepositoryImpl;
import com.datasoft.co_op360.storage.SavingRepositoryImpl;
import com.datasoft.co_op360.storage.converters.SavingModelConverter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/8/17.
 */

public class DownloadSavingImpl extends AbstractInteractor {

    private DownloadSaving.CallBack mCallback;
    private SavingApiInterface apiService;
    private String mApi_key;
    private int mfo_id;
    private int mbranch_id;

    public DownloadSavingImpl(Executor threadExecutor, MainThread mainThread, DownloadSaving.CallBack callback, String api_key, int fo_id, int branch_id) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mApi_key = api_key;
        mfo_id = fo_id;
        mbranch_id = branch_id;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(SavingApiInterface.class);
        Call<SavingResponse> call = apiService.getSaving(mApi_key, mfo_id, mbranch_id);

        call.enqueue(new Callback<SavingResponse>() {
            @Override
            public void onResponse(Call<SavingResponse> call, Response<SavingResponse> response) {

                SavingRepository savingRepository = new SavingRepositoryImpl();
                SavingProductRepository savingProductRepository = new SavingProductRepositoryImpl();
                BankHeadRepository bankHeadRepository = new BankHeadRepositoryImpl();

                try {
                    for (RESTSaving restSaving : response.body().getSavingList()) {
                        savingRepository.insert(SavingModelConverter.convertRestToDoaminModel(restSaving));
                    }

                    for (RESTSavingProduct restSavingProduct : response.body().getSavingProducts()) {
                        savingProductRepository.insert(SavingProductModelConverter.convertRestToDoaminModel(restSavingProduct));
                    }

                    for (RESTBankHead restBankHead : response.body().getBankHeads()) {
                        bankHeadRepository.insert(BankHeadModelConverter.convertRestToDoaminModel(restBankHead));
                    }

                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                } finally {

                    mCallback.onSavingDownloaded();
                }

            }

            @Override
            public void onFailure(Call<SavingResponse> call, Throwable t) {

                mCallback.onSavingDownloadError();
            }
        });
    }
}
