package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.IndividualSavingsData;

import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public interface FoDeatailsSavingsInteractor {

    interface FoDetailsSavingsLoadFinishedListener {

        void onDetailsSavingsLoad(List<IndividualSavingsData> individualSavingsDatas);
    }

    void loadDetailsSavingsData(FoDetailsSavingsLoadFinishedListener listener);
}
