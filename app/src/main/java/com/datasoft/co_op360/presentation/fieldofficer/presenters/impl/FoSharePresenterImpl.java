package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.ShareListItemData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoShareInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.FoShareIntersctorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSharePresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoShareListView;

import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public class FoSharePresenterImpl implements FoSharePresenter, FoShareInteractor.FoSharesLoadFinishedListener {

    private FoShareListView foShareListView;
    private FoShareInteractor foShareInteractor;

    public FoSharePresenterImpl(FoShareListView foShareListView) {

        this.foShareListView = foShareListView;
        foShareInteractor = new FoShareIntersctorImpl();
    }

    @Override
    public void getAllShares() {

        if (foShareListView != null) {
            foShareListView.showProgress();
        }

        foShareInteractor.loadSharesData(this);
    }

    @Override
    public void onItemClick(ShareListItemData shareListItemData) {

        foShareListView.ItemClick(shareListItemData);
    }

    @Override
    public void onSharesLoad(List<ShareListItemData> list) {

        if (foShareListView != null) {

            foShareListView.showShares(list);
            foShareListView.hideProgress();
        }
    }

}
