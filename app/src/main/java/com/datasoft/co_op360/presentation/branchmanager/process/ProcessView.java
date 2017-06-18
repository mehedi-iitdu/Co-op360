package com.datasoft.co_op360.presentation.branchmanager.process;

import java.util.List;


/**
 * Created by mehedi on 3/16/17.
 */

public interface ProcessView {

    void setProcesses(List<ProcessData> list);

    void onItemclick(ProcessData processData);
}
