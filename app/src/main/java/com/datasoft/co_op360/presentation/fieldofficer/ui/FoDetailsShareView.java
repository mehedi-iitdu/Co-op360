package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.IndividualShareData;

import java.util.List;

/**
 * Created by mehedi on 4/20/17.
 */

public interface FoDetailsShareView {

    void showProgress();

    void hideProgress();

    void showDetailsShare(List<IndividualShareData> individualShareDataList);

    void editClick(IndividualShareData individualShareData);

    void deleteClick(IndividualShareData individualShareData);
}
