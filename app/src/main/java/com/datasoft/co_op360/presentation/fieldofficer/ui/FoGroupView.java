package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.GroupData;

import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public interface FoGroupView {

    void setProcesses(List<GroupData> list);

    void showProgress();

    void hideProgress();

    void onItemclick(GroupData groupData);
}
