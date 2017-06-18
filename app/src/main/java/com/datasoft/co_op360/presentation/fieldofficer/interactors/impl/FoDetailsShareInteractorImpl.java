package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoDetailsShareInteractor;
import com.datasoft.co_op360.domain.model.IndividualShareData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */


public class FoDetailsShareInteractorImpl implements FoDetailsShareInteractor {

    @Override
    public void loadDetailsShareData(final FoDetailsShareLoadFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onDetailsShareLoad(createArrayList());
            }
        }, 1000);
    }

    private List<IndividualShareData> createArrayList() {

        List<IndividualShareData> individualShareDataList = new ArrayList<>();

        individualShareDataList.add(new IndividualShareData("S-001-001", "Purchase", "Share Product-001", "250"));
        individualShareDataList.add(new IndividualShareData("S-001-002", "Sell", "Share Product-001", "150"));
        individualShareDataList.add(new IndividualShareData("S-001-001", "Purchase", "Share Product-001", "250"));
        individualShareDataList.add(new IndividualShareData("S-001-002", "Sell", "Share Product-001", "150"));
        individualShareDataList.add(new IndividualShareData("S-001-001", "Purchase", "Share Product-001", "250"));

        return individualShareDataList;
    }
}
