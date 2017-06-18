package com.datasoft.co_op360.presentation.managementpanel.process;

import java.util.List;

/**
 * Created by mehedi on 3/16/17.
 */

public class ProcessPresenterImpl implements ProcessPresenter, ProcessInteractor.ProcessFinishedListener {

    ProcessView processView;
    ProcessInteractor processInteractor;

    public ProcessPresenterImpl(ProcessView processView) {

        this.processView = processView;
        this.processInteractor = new ProcessInteractorImpl();
    }


    @Override
    public void getProcessData() {

        processInteractor.loadProcessData(this);
    }

    @Override
    public void click(ProcessData processData) {

        processView.onItemclick(processData);

    }

    @Override
    public void onDestroy() {

        processView = null;
    }

    @Override
    public void onProcessDataLoad(List<ProcessData> list) {

        processView.setProcesses(list);
    }
}
