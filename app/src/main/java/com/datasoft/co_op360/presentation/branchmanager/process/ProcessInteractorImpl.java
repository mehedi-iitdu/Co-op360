package com.datasoft.co_op360.presentation.branchmanager.process;

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

        ProcessData cardList1 = new ProcessData(R.drawable.samity, "Group Approval");
        ProcessData cardList2 = new ProcessData(R.drawable.check_out, "Group Creation");
        ProcessData cardList3 = new ProcessData(R.drawable.batch, "Batch");
        ProcessData cardList4 = new ProcessData(R.drawable.samity_process, "Samity Process");

        list.add(cardList1);
        list.add(cardList2);
        list.add(cardList3);
        list.add(cardList4);

        listener.onProcessDataLoad(list);
    }

}
