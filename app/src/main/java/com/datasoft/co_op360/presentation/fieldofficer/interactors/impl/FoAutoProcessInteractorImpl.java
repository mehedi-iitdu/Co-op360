package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.repository.SamityRepository;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoAutoProcessInteractor;
import com.datasoft.co_op360.storage.SamityRepositoryImpl;
import com.datasoft.co_op360.domain.executor.MainThread;

/**
 * Created by mehedi on 3/31/17.
 */

public class FoAutoProcessInteractorImpl extends AbstractInteractor implements FoAutoProcessInteractor {

    SamityRepository samityRepository;
    FoAutoProcessInteractor.Callback mCallback;

    public FoAutoProcessInteractorImpl(Executor threadExecutor, MainThread mainThread, FoAutoProcessInteractor.Callback callback) {
        super(threadExecutor, mainThread);
        mCallback = callback;
    }

    @Override
    public void run() {
        samityRepository = new SamityRepositoryImpl();

        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onProcessDataLoad(samityRepository.getAllSamities());
            }
        });
    }
}
