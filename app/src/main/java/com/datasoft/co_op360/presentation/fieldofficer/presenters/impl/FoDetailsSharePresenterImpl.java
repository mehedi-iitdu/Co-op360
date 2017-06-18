package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoDetailsShareInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.FoDetailsShareInteractorImpl;
import com.datasoft.co_op360.domain.model.IndividualShareData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSharePresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsShareView;

import java.util.List;


/**
 * Created by mehedi on 5/15/17.
 */

public class FoDetailsSharePresenterImpl implements FoDetailsSharePresenter, FoDetailsShareInteractor.FoDetailsShareLoadFinishedListener {

    FoDetailsShareView foDetailsShareView;
    FoDetailsShareInteractor foDeatailsShareInteractor;

    public FoDetailsSharePresenterImpl(FoDetailsShareView foDetailsShareView) {
        this.foDetailsShareView = foDetailsShareView;
        foDeatailsShareInteractor = new FoDetailsShareInteractorImpl();
    }

    @Override
    public void getDetailsShareData() {

        if (foDetailsShareView != null) {
            foDetailsShareView.showProgress();
        }

        foDeatailsShareInteractor.loadDetailsShareData(this);
    }

    @Override
    public void onDestroy() {

        foDetailsShareView = null;
    }

    @Override
    public void onEditClick(IndividualShareData individualShareData) {
        foDetailsShareView.editClick(individualShareData);
    }

    @Override
    public void onDeleteClick(IndividualShareData individualShareData) {
        foDetailsShareView.deleteClick(individualShareData);
    }

    @Override
    public void onDetailsShareLoad(List<IndividualShareData> individualShareDatas) {

        /*Log.e("onDetailsShareLoad", "Okay");*/

        if (foDetailsShareView != null) {

            foDetailsShareView.showDetailsShare(individualShareDatas);
            foDetailsShareView.hideProgress();
        }
    }

}
