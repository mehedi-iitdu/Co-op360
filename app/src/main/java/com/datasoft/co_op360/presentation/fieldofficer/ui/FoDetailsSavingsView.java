package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.IndividualSavingsData;

import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public interface FoDetailsSavingsView {

    void showProgress();

    void hideProgress();

    void showDetailsSavings(List<IndividualSavingsData> individualSavingsDataList);

    void editClick(IndividualSavingsData individualSavingsData);

    void deleteClick(IndividualSavingsData individualSavingsData);
}
