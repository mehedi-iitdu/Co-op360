package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.model.SavingsListItemData;

import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public interface FoSavingsInteractor {

    interface FoSavingsLoadFinishedListener {

        void onSavingsLoad(List<SavingsListItemData> list);
    }

    void loadSavingsData(FoSavingsLoadFinishedListener listener);

}
