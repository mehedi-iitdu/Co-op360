package com.datasoft.co_op360.network.download.impl;

import android.util.Log;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.LoanProductInterestRateRepository;
import com.datasoft.co_op360.domain.repository.LoanProductRepository;
import com.datasoft.co_op360.domain.repository.LoanPurposeCategoryRepository;
import com.datasoft.co_op360.domain.repository.LoanPurposeRepository;
import com.datasoft.co_op360.domain.repository.LoanRepository;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadLoan;
import com.datasoft.co_op360.network.model.RESTLoan;
import com.datasoft.co_op360.network.model.RESTLoanProduct;
import com.datasoft.co_op360.network.model.RESTLoanProductInterestRate;
import com.datasoft.co_op360.network.model.RESTLoanPurpose;
import com.datasoft.co_op360.network.model.RESTLoanPurposeCategory;
import com.datasoft.co_op360.network.response.LoanResponse;
import com.datasoft.co_op360.network.services.LoanApiInterface;
import com.datasoft.co_op360.storage.LoanProductInterestRateRepositoryImpl;
import com.datasoft.co_op360.storage.LoanProductRepositoryImpl;
import com.datasoft.co_op360.storage.LoanPurposeCategoryRepositoryImpl;
import com.datasoft.co_op360.storage.LoanPurposeRepositoryImpl;
import com.datasoft.co_op360.storage.LoanRepositoryImpl;
import com.datasoft.co_op360.storage.converters.LoanModelConverter;
import com.datasoft.co_op360.storage.converters.LoanProductInterestRateModelConverter;
import com.datasoft.co_op360.storage.converters.LoanProductModelConverter;
import com.datasoft.co_op360.storage.converters.LoanPurposeCategoryModelConverter;
import com.datasoft.co_op360.storage.converters.LoanPurposeModelConverter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/6/17.
 */

public class DownloadLoanImpl extends AbstractInteractor {

    private DownloadLoan.CallBack mCallback;
    private LoanApiInterface apiService;
    private String mApi_key;
    private int mfo_id;
    private int mbranch_id;

    public DownloadLoanImpl(Executor threadExecutor, MainThread mainThread, DownloadLoan.CallBack callback, String api_key, int fo_id, int branch_id) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mApi_key = api_key;
        mfo_id = fo_id;
        mbranch_id = branch_id;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(LoanApiInterface.class);
        Call<LoanResponse> call = apiService.getLoan(mApi_key, mfo_id, mbranch_id);

        call.enqueue(new Callback<LoanResponse>() {
            @Override
            public void onResponse(Call<LoanResponse> call, Response<LoanResponse> response) {

                LoanRepository loanRepository = new LoanRepositoryImpl();
                LoanProductRepository loanProductRepository = new LoanProductRepositoryImpl();
                LoanProductInterestRateRepository loanProductInterestRateRepository = new LoanProductInterestRateRepositoryImpl();
                LoanPurposeRepository loanPurposeRepository = new LoanPurposeRepositoryImpl();
                LoanPurposeCategoryRepository loanPurposeCategoryRepository = new LoanPurposeCategoryRepositoryImpl();

                try {

                    for (RESTLoan rest : response.body().getRestLoanList()) {
                        loanRepository.insert(LoanModelConverter.convertRestToDoaminModel(rest));
                    }

                    for (RESTLoanProduct rest : response.body().getRestLoanProducts()) {
                        loanProductRepository.insert(LoanProductModelConverter.convertRestToDomainModel(rest));
                    }

                    for (RESTLoanProductInterestRate rest : response.body().getRestLoanProductInterestRates()) {
                        loanProductInterestRateRepository.insert(LoanProductInterestRateModelConverter.convertRestToDomainModel(rest));
                    }

                    for (RESTLoanPurpose rest : response.body().getRestLoanPurposes()) {
                        loanPurposeRepository.insert(LoanPurposeModelConverter.convertRestToDomainModel(rest));
                    }

                    for (RESTLoanPurposeCategory rest : response.body().getRestLoanPurposeCategories()) {
                        loanPurposeCategoryRepository.insert(LoanPurposeCategoryModelConverter.convertRestToDomainModel(rest));
                    }
                } catch (Exception e) {
                    Log.e("Download Loan", e.getMessage());
                } finally {

                    mCallback.onLoanDownloaded();
                }

            }

            @Override
            public void onFailure(Call<LoanResponse> call, Throwable t) {

                mCallback.onLoanDownloadError();
            }
        });
    }
}
