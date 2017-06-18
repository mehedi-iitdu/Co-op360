package com.datasoft.co_op360.network.download.impl;

import android.util.Log;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.EmployeeRepository;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadEmployee;
import com.datasoft.co_op360.storage.EmployeeRepositoryImpl;
import com.datasoft.co_op360.storage.converters.EmployeeModelConverter;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.network.response.EmployeeResponse;
import com.datasoft.co_op360.network.services.EmployeeApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/12/17.
 */

public class DownloadEmployeeImpl extends AbstractInteractor {

    private String mApi_key;
    private int mEmployee_id;
    DownloadEmployee.CallBack mCallback;
    EmployeeApiInterface apiService;

    public DownloadEmployeeImpl(Executor threadExecutor, MainThread mainThread, DownloadEmployee.CallBack callBack, String api_key, int employee_id) {
        super(threadExecutor, mainThread);
        mApi_key = api_key;
        mEmployee_id = employee_id;
        mCallback = callBack;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(EmployeeApiInterface.class);
        Call<EmployeeResponse> call = apiService.getEmployee(mApi_key, mEmployee_id);

        call.enqueue(new Callback<EmployeeResponse>() {
            @Override
            public void onResponse(Call<EmployeeResponse> call, Response<EmployeeResponse> response) {

                EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

                try {
                    employeeRepository.insert(EmployeeModelConverter.convertRestToDoaminModel(response.body().getRestEmployee()));
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                } finally {

                    mCallback.onEmployeeDownloaded();
                }
            }

            @Override
            public void onFailure(Call<EmployeeResponse> call, Throwable t) {

                mCallback.onEmployeeDownloadError();
            }
        });

    }
}
