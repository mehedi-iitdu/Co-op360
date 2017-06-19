package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.Member;

import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public interface AutoProcessMemberListView {

    void setProcesses(List<Member> list);

    void showProgress();

    void hideProgress();

    void onItemclick(Member member);
}
