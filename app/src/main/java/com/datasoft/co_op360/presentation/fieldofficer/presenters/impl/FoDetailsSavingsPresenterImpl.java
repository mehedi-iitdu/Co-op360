package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import android.util.Log;

import com.datasoft.co_op360.domain.interactors.FoDeatailsSavingsInteractor;
import com.datasoft.co_op360.domain.interactors.impl.FoDeatailsSavingsInteractorImpl;
import com.datasoft.co_op360.domain.model.IndividualSavingsData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSavingsPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsSavingsView;

import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public class FoDetailsSavingsPresenterImpl implements FoDetailsSavingsPresenter, FoDeatailsSavingsInteractor.FoDetailsSavingsLoadFinishedListener {

    FoDetailsSavingsView foDetailsSavingsView;
    FoDeatailsSavingsInteractor foDeatailsSavingsInteractor;

    public FoDetailsSavingsPresenterImpl(FoDetailsSavingsView foDetailsSavingsView) {
        this.foDetailsSavingsView = foDetailsSavingsView;
        foDeatailsSavingsInteractor = new FoDeatailsSavingsInteractorImpl();
    }

    @Override
    public void getDetailsSavingsData() {

        if (foDetailsSavingsView != null) {
            foDetailsSavingsView.showProgress();
        }

        foDeatailsSavingsInteractor.loadDetailsSavingsData(this);
    }

    @Override
    public void onDestroy() {

        foDetailsSavingsView = null;
    }

    @Override
    public void onEditClick(IndividualSavingsData individualSavingsData) {
        foDetailsSavingsView.editClick(individualSavingsData);
    }

    @Override
    public void onDeleteClick(IndividualSavingsData individualSavingsData) {
        foDetailsSavingsView.deleteClick(individualSavingsData);
    }

    @Override
    public void onDetailsSavingsLoad(List<IndividualSavingsData> individualSavingsDatas) {

        Log.e("onDetailsSavingsLoad", "Okay");

        if (foDetailsSavingsView != null) {

            foDetailsSavingsView.showDetailsSavings(individualSavingsDatas);
            foDetailsSavingsView.hideProgress();
        }
    }
}
