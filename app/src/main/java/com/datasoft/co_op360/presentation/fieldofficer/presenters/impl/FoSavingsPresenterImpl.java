package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSavingsPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoSavingsInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.FoSavingsInteractorImpl;
import com.datasoft.co_op360.domain.model.SavingsListItemData;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoSavingsListView;

import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public class FoSavingsPresenterImpl implements FoSavingsPresenter, FoSavingsInteractor.FoSavingsLoadFinishedListener {

    private FoSavingsListView foSavingsListView;
    private FoSavingsInteractor foSavingsInteractor;

    public FoSavingsPresenterImpl(FoSavingsListView foSavingsListView) {

        this.foSavingsListView = foSavingsListView;
        foSavingsInteractor = new FoSavingsInteractorImpl();
    }

    @Override
    public void getAllSavings() {

        if (foSavingsListView != null) {
            foSavingsListView.showProgress();
        }

        foSavingsInteractor.loadSavingsData(this);
    }

    @Override
    public void onItemClick(SavingsListItemData savingsListItemData) {

        foSavingsListView.ItemClick(savingsListItemData);
    }

    @Override
    public void onSavingsLoad(List<SavingsListItemData> list) {

        if (foSavingsListView != null) {

            foSavingsListView.showSavings(list);
            foSavingsListView.hideProgress();
        }
    }
}
