package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;
import android.util.Log;

import com.datasoft.co_op360.domain.model.IndividualSavingsData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoDeatailsSavingsInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public class FoDeatailsSavingsInteractorImpl implements FoDeatailsSavingsInteractor {


    @Override
    public void loadDetailsSavingsData(final FoDetailsSavingsLoadFinishedListener listener) {

        Log.e("loadDetailsSavingsData", "Okay");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onDetailsSavingsLoad(createArrayList());
            }
        }, 1000);
    }

    private List<IndividualSavingsData> createArrayList() {

        List<IndividualSavingsData> individualSavingsDataList = new ArrayList<>();

        individualSavingsDataList.add(new IndividualSavingsData("S-001-001", "Withdraw", "Sp-001", "250"));
        individualSavingsDataList.add(new IndividualSavingsData("S-001-002", "Deposit", "Sp-001", "150"));

        return individualSavingsDataList;
    }
}
