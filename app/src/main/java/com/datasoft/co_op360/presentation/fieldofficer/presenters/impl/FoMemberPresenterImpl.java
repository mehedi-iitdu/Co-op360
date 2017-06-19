package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoMemberView;
import com.datasoft.co_op360.domain.interactors.FoMemberInteractor;
import com.datasoft.co_op360.domain.interactors.impl.FoMemberInteractorImpl;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoMemberPresenter;

import java.util.List;

/**
 * Created by mehedi on 5/9/17.
 */

public class FoMemberPresenterImpl implements FoMemberPresenter, FoMemberInteractor.MemberListFinishedListener {

    FoMemberView foMemberView;
    FoMemberInteractor foMemberInteractor;

    public FoMemberPresenterImpl(FoMemberView foMemberView) {
        this.foMemberView = foMemberView;
        foMemberInteractor = new FoMemberInteractorImpl();
    }

    @Override
    public void getMemberList() {
        if (foMemberView != null) {
            foMemberView.showProgress();
        }
        foMemberInteractor.loadMemberList(this);
    }

    @Override
    public void editClick(MemberListData memberListData) {
        if (foMemberView != null) {
            foMemberView.onEditclick(memberListData);
        }
    }

    @Override
    public void deleteClick(MemberListData memberListData) {
        if (foMemberView != null) {
            foMemberView.onDeleteClick(memberListData);
        }
    }

    @Override
    public void onDestroy() {
        if (foMemberView != null) {
            foMemberView = null;
        }
    }

    @Override
    public void onMembersListLoad(List<Member> list) {
        if (foMemberView != null) {
            foMemberView.setMemberList(list);
        }
        foMemberView.hideProgress();
    }
}
