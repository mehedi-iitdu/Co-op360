package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.presentation.fieldofficer.interactors.ProcessInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoProcessView;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.ProcessInteractorImpl;
import com.datasoft.co_op360.domain.model.ProcessData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.ProcessPresenter;

import java.util.List;

/**
 * Created by mehedi on 3/16/17.
 */

public class ProcessPresenterImpl implements ProcessPresenter, ProcessInteractor.ProcessFinishedListener {

    FoProcessView foProcessView;
    ProcessInteractor processInteractor;

    public ProcessPresenterImpl(FoProcessView foProcessView) {

        this.foProcessView = foProcessView;
        this.processInteractor = new ProcessInteractorImpl();
    }


    @Override
    public void getProcessData() {

        processInteractor.loadProcessData(this);
    }

    @Override
    public void click(ProcessData processData) {

        foProcessView.onItemclick(processData);

    }

    @Override
    public void onDestroy() {

        foProcessView = null;
    }

    @Override
    public void onProcessDataLoad(List<ProcessData> list) {

        foProcessView.setProcesses(list);
    }
}
