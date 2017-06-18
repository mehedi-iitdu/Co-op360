package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.ProcessData;

/**
 * Created by mehedi on 3/16/17.
 */

public interface ProcessPresenter {

    void getProcessData();

    void click(ProcessData processData);

    void onDestroy();
}
