package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoShareInteractor;
import com.datasoft.co_op360.domain.model.ShareListItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public class FoShareIntersctorImpl implements FoShareInteractor {

    @Override
    public void loadSharesData(final FoSharesLoadFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onSharesLoad(createArrayList());
            }
        }, 1000);

    }


    private List<ShareListItemData> createArrayList() {

        List<ShareListItemData> list = new ArrayList<>();

        list.add(new ShareListItemData("Rabeya", "001-02-15", "Md, Kashem", "200"));
        list.add(new ShareListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));
        list.add(new ShareListItemData("Rabeya", "001-02-15", "Md, Kashem", "150"));
        list.add(new ShareListItemData("Rabeya", "001-02-15", "Md, Kashem", "500"));
        list.add(new ShareListItemData("Rabeya", "001-02-15", "Md, Kashem", "100"));

        return list;
    }
}
