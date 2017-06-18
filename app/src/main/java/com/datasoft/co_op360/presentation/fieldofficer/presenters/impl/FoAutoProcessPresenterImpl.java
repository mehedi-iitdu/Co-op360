package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetAllSamitiesInteractor;
import com.datasoft.co_op360.domain.interactors.impl.GetAllSamitiesInteractorImpl;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.AbstractPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.AutoProcessGroupListView;
import com.datasoft.co_op360.storage.SamityRepositoryImpl;

import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public class FoAutoProcessPresenterImpl extends AbstractPresenter implements FoAutoProcessPresenter, GetAllSamitiesInteractor.Callback {

    private AutoProcessGroupListView autoProcessGroupListView;

    public FoAutoProcessPresenterImpl(Executor executor, MainThread mainThread, AutoProcessGroupListView autoProcessGroupListView) {
        super(executor, mainThread);
        this.autoProcessGroupListView = autoProcessGroupListView;
    }

    @Override
    public void getAutoProcessData() {

        if (autoProcessGroupListView != null) {

            autoProcessGroupListView.showProgress();
        }
        new GetAllSamitiesInteractorImpl(mExecutor, mMainThread, new SamityRepositoryImpl(), this).execute();
    }

    @Override
    public void itemClick(Samity samity) {

        autoProcessGroupListView.onItemclick(samity);
    }

    @Override
    public void onDestroy() {

        autoProcessGroupListView = null;
    }

    @Override
    public void onSamitiesRetrieved(List<Samity> samityList) {

        if (autoProcessGroupListView != null) {

            autoProcessGroupListView.setProcesses(samityList);
            autoProcessGroupListView.hideProgress();
        }
    }
}
