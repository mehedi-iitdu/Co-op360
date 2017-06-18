package com.datasoft.co_op360.network.download.impl;

import android.util.Log;

import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.download.DownloadMember;
import com.datasoft.co_op360.network.model.RESTMember;
import com.datasoft.co_op360.network.response.MemberResponse;
import com.datasoft.co_op360.storage.MemberRepositoryImpl;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.repository.MemberRepository;
import com.datasoft.co_op360.network.services.MemberApiInterface;
import com.datasoft.co_op360.storage.converters.MemberModelConverter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehedi on 6/11/17.
 */

public class DownloadMemberImpl extends AbstractInteractor {

    private String mApi_key;
    private int mFo_id;
    private int mBranch_id;
    DownloadMember.CallBack mCallback;
    MemberApiInterface apiService;

    public DownloadMemberImpl(Executor threadExecutor, MainThread mainThread, DownloadMember.CallBack callback, String api_key, int fo_id, int branch_id) {
        super(threadExecutor, mainThread);
        mApi_key = api_key;
        mFo_id = fo_id;
        mBranch_id = branch_id;
        mCallback = callback;
    }

    @Override
    public void run() {

        apiService = ApiClient.getClient().create(MemberApiInterface.class);
        Call<MemberResponse> call = apiService.getMembers(mApi_key, mFo_id, mBranch_id);

        call.enqueue(new Callback<MemberResponse>() {
            @Override
            public void onResponse(Call<MemberResponse> call, Response<MemberResponse> response) {

                try {
                    MemberRepository memberRepository = new MemberRepositoryImpl();
                    for (RESTMember restMember : response.body().getRestMemberList()) {
                        memberRepository.insert(MemberModelConverter.convertRestToDomainModel(restMember));
                    }
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                } finally {

                    mCallback.onMemberDownloaded();
                }
            }

            @Override
            public void onFailure(Call<MemberResponse> call, Throwable t) {

                mCallback.onMemberDownloadError();
            }
        });

    }
}
