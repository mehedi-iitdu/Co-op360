package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import com.datasoft.co_op360.domain.model.ProcessData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.ProcessInteractor;
import com.datasoft.co_op360.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 3/16/17.
 */

public class ProcessInteractorImpl implements ProcessInteractor {

    List<ProcessData> list;

    @Override
    public void loadProcessData(ProcessFinishedListener listener) {

        list = new ArrayList<>();

        ProcessData cardList1 = new ProcessData(R.drawable.member_process, "Auto Process");
        ProcessData cardList2 = new ProcessData(R.drawable.batch, "Batch Process");
        ProcessData cardList3 = new ProcessData(R.drawable.member, "Member");
        ProcessData cardList4 = new ProcessData(R.drawable.samity, "Group");
        ProcessData cardList5 = new ProcessData(R.drawable.savings, "Savings");
        ProcessData cardList6 = new ProcessData(R.drawable.loan, "Loan");
        ProcessData cardList7 = new ProcessData(R.drawable.ic_menu_share, "Share");

        list.add(cardList1);
        list.add(cardList2);
        list.add(cardList3);
        list.add(cardList4);
        list.add(cardList5);
        list.add(cardList6);
        list.add(cardList7);

        listener.onProcessDataLoad(list);
    }

}
