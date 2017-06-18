package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.MemberListData;

/**
 * Created by mehedi on 5/9/17.
 */

public interface FoMemberPresenter {

    void getMemberList();

    void editClick(MemberListData memberListData);

    void deleteClick(MemberListData memberListData);

    void onDestroy();
}
