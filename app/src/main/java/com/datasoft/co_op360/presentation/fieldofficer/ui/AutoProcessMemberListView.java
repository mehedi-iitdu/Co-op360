package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.MemberListData;

import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public interface AutoProcessMemberListView {

    void setProcesses(List<MemberListData> list);

    void showProgress();

    void hideProgress();

    void onItemclick(MemberListData memberListData);
}
