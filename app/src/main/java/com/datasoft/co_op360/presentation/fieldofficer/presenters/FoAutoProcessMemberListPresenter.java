package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.MemberListData;

/**
 * Created by mehedi on 4/3/17.
 */

public interface FoAutoProcessMemberListPresenter {

    void getMemberList();

    void itemClick(MemberListData memberListData);

    void onDestroy();
}
