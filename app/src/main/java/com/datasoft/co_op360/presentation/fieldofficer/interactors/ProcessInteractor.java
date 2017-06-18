package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.ProcessData;

import java.util.List;

/**
 * Created by mehedi on 3/16/17.
 */

public interface ProcessInteractor {

    interface ProcessFinishedListener {

        void onProcessDataLoad(List<ProcessData> list);
    }

    void loadProcessData(ProcessFinishedListener listener);
}
