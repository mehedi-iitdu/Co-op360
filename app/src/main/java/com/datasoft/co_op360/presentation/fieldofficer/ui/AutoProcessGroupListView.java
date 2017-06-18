package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.Samity;

import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public interface AutoProcessGroupListView {

    void setProcesses(List<Samity> list);

    void showProgress();

    void hideProgress();

    void onItemclick(Samity samity);
}
