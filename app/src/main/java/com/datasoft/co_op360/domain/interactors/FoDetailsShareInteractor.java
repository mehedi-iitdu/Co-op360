package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.model.IndividualShareData;

import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public interface FoDetailsShareInteractor {

    void loadDetailsShareData(FoDetailsShareLoadFinishedListener listener);

    interface FoDetailsShareLoadFinishedListener {

        void onDetailsShareLoad(List<IndividualShareData> individualShareDataList);
    }

}
