package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetAllSamitiesInteractor;
import com.datasoft.co_op360.domain.interactors.impl.GetAllSamitiesInteractorImpl;
import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.domain.interactors.FoGroupInteractor;
import com.datasoft.co_op360.domain.interactors.impl.FoGroupInteractorImpl;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.AbstractPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoGroupPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoGroupView;
import com.datasoft.co_op360.storage.SamityRepositoryImpl;

import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public class FoGroupPresenterImpl extends AbstractPresenter implements FoGroupPresenter, GetAllSamitiesInteractor.Callback {

    private FoGroupView foGroupView;

    public FoGroupPresenterImpl(Executor executor, MainThread mainThread, FoGroupView foGroupView) {
        super(executor, mainThread);
        this.foGroupView = foGroupView;
    }

    @Override
    public void getAutoProcessData() {

        if (foGroupView != null) {

            foGroupView.showProgress();
        }

        new GetAllSamitiesInteractorImpl(mExecutor, mMainThread, new SamityRepositoryImpl(), this).execute();

    }

    @Override
    public void itemClick(Samity samity) {

        foGroupView.onItemclick(samity);
    }

    @Override
    public void onDestroy() {

        foGroupView = null;

    }

    @Override
    public void onSamitiesRetrieved(List<Samity> samityList) {

        if (foGroupView != null) {

            foGroupView.setProcesses(samityList);
            foGroupView.hideProgress();
        }
    }
}
