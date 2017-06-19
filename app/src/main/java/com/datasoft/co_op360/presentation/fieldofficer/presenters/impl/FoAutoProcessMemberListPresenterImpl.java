package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.domain.interactors.FoAutoProcessMemberListInteractor;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessMemberListPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.AutoProcessMemberListView;
import com.datasoft.co_op360.domain.interactors.impl.FoAutoProcessMemberListInteractorImpl;

import java.util.List;

/**
 * Created by mehedi on 4/3/17.
 */

public class FoAutoProcessMemberListPresenterImpl implements FoAutoProcessMemberListPresenter, FoAutoProcessMemberListInteractor.MemberListFinishedListener {

    private AutoProcessMemberListView memberListView;
    private FoAutoProcessMemberListInteractor foAutoProcessMemberListInteractor;

    public FoAutoProcessMemberListPresenterImpl(AutoProcessMemberListView memberListView) {

        this.memberListView = memberListView;
        foAutoProcessMemberListInteractor = new FoAutoProcessMemberListInteractorImpl();
    }

    @Override
    public void getMemberList() {

        if (memberListView != null) {

            memberListView.showProgress();
        }

        foAutoProcessMemberListInteractor.loadMemberList(this);
    }

    @Override
    public void itemClick(MemberListData memberListData) {

        memberListView.onItemclick(memberListData);
    }

    @Override
    public void onDestroy() {

        memberListView = null;
    }

    @Override
    public void onMembersListLoad(List<MemberListData> list) {

        if (memberListView != null) {

            memberListView.setProcesses(list);
            memberListView.hideProgress();
        }
    }
}
