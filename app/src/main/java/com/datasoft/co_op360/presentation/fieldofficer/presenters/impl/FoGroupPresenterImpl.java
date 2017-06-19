package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.domain.interactors.FoGroupInteractor;
import com.datasoft.co_op360.domain.interactors.impl.FoGroupInteractorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoGroupPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoGroupView;

import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public class FoGroupPresenterImpl implements FoGroupPresenter, FoGroupInteractor.FoGroupLoadFinishedListener {

    private FoGroupView foGroupView;
    private FoGroupInteractor foGroupInteractor;

    public FoGroupPresenterImpl(FoGroupView foGroupView) {

        this.foGroupView = foGroupView;
        foGroupInteractor = new FoGroupInteractorImpl();
    }

    @Override
    public void getAutoProcessData() {

        if (foGroupView != null) {

            foGroupView.showProgress();
        }

        foGroupInteractor.loadProcessData(this);

    }

    @Override
    public void itemClick(GroupData groupData) {

        foGroupView.onItemclick(groupData);
    }

    @Override
    public void onDestroy() {

        foGroupView = null;

    }

    @Override
    public void onProcessDataLoad(List<GroupData> list) {

        if (foGroupView != null) {

            foGroupView.setProcesses(list);
            foGroupView.hideProgress();
        }

    }
}
