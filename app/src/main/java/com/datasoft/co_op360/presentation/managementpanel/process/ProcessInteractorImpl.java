package com.datasoft.co_op360.presentation.managementpanel.process;

import com.datasoft.co_op360.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 3/16/17.
 */

class ProcessInteractorImpl implements ProcessInteractor {

    List<ProcessData> list;

    @Override
    public void loadProcessData(ProcessFinishedListener listener) {

        list = new ArrayList<>();

        ProcessData cardList1 = new ProcessData(R.drawable.samity, "Branch Approval");
        ProcessData cardList2 = new ProcessData(R.drawable.check_out, "Brnach Creation");
        ProcessData cardList3 = new ProcessData(R.drawable.batch, "Batch");

        list.add(cardList1);
        list.add(cardList2);
        list.add(cardList3);

        listener.onProcessDataLoad(list);
    }

}
