package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.ProcessData;

import java.util.List;


/**
 * Created by mehedi on 3/16/17.
 */

public interface FoProcessView {

    void setProcesses(List<ProcessData> list);

    void onItemclick(ProcessData processData);
}
