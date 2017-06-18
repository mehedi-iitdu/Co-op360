package com.datasoft.co_op360.presentation.fieldofficer.ui;

import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.model.MemberListData;

import java.util.List;

/**
 * Created by mehedi on 5/8/17.
 */

public interface FoMemberView {

    void setMemberList(List<Member> list);

    void showProgress();

    void hideProgress();

    void onEditclick(MemberListData memberListData);

    void onDeleteClick(MemberListData memberListData);
}
