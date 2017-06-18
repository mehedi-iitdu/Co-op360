package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoSavingsInteractor;
import com.datasoft.co_op360.domain.model.SavingsListItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public class FoSavingsInteractorImpl implements FoSavingsInteractor {


    @Override
    public void loadSavingsData(final FoSavingsLoadFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSavingsLoad(createArrayList());
            }
        }, 1000);

    }


    private List<SavingsListItemData> createArrayList() {

        List<SavingsListItemData> list = new ArrayList<>();

        list.add(new SavingsListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));
        list.add(new SavingsListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));
        list.add(new SavingsListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));
        list.add(new SavingsListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));
        list.add(new SavingsListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));

        return list;
    }
}
