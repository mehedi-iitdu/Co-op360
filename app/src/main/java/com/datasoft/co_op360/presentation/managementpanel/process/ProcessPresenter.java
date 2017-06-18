package com.datasoft.co_op360.presentation.managementpanel.process;

/**
 * Created by mehedi on 3/16/17.
 */

public interface ProcessPresenter {

    void getProcessData();

    void click(ProcessData processData);

    void onDestroy();
}
