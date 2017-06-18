package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;

import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoGroupInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public class FoGroupInteractorImpl implements FoGroupInteractor {

    @Override
    public void loadProcessData(final FoGroupInteractor.FoGroupLoadFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onProcessDataLoad(createArrayList());
            }
        }, 1000);

    }

    public List<GroupData> createArrayList() {

        List<GroupData> list = new ArrayList<>();

        list.add(new GroupData("Group One - Dhaka", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Two - Dhaka", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Three - Dhaka", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Four - Dhaka", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Five - Dhaka", "31", "14000", "10000", "250000"));

        list.add(new GroupData("Group One - Bar", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Two - Bar", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Three - Bar", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Four - Bar", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Five - Bar", "31", "14000", "10000", "250000"));

        list.add(new GroupData("Group One - Raj", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Two - Raj", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Three - Raj", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Four - Raj", "31", "14000", "10000", "250000"));
        list.add(new GroupData("Group Five - Rajfo@", "31", "14000", "10000", "250000"));

        return list;
    }
}
