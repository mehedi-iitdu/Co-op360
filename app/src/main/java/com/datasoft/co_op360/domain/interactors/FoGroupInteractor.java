package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.model.GroupData;

import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public interface FoGroupInteractor {

    interface FoGroupLoadFinishedListener {

        void onProcessDataLoad(List<GroupData> list);
    }

    void loadProcessData(FoGroupLoadFinishedListener listener);
}
