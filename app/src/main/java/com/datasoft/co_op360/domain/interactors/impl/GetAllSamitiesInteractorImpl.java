package com.datasoft.co_op360.domain.interactors.impl;

import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetAllSamitiesInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.SamityRepository;

import java.util.List;

/**
 * Created by mehedi on 6/18/17.
 */

public class GetAllSamitiesInteractorImpl extends AbstractInteractor {

    SamityRepository mSamityRepository;
    GetAllSamitiesInteractor.Callback mCallback;

    public GetAllSamitiesInteractorImpl(Executor threadExecutor, MainThread mainThread, SamityRepository samityRepository,
                                        GetAllSamitiesInteractor.Callback callback) {
        super(threadExecutor, mainThread);

        if (samityRepository == null || callback == null) {
            throw new IllegalArgumentException("Arguments can not be null!");
        }

        mSamityRepository = samityRepository;
        mCallback = callback;
    }

    @Override
    public void run() {
        // retrieve the Members from the database
        final List<Samity> samityList = mSamityRepository.getAllSamities();

        // Show Samities on the main thread
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onSamitiesRetrieved(samityList);
            }
        });
    }
}
