package com.datasoft.co_op360.presentation.fieldofficer.presenters.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetMemberBySamityIdInteractor;
import com.datasoft.co_op360.domain.interactors.impl.GetMemberBySamityIdInteractorImpl;
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.AbstractPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessMemberListPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.AutoProcessMemberListView;
import com.datasoft.co_op360.storage.MemberRepositoryImpl;
import java.util.List;

/**
 * Created by mehedi on 4/3/17.
 */

public class FoAutoProcessMemberListPresenterImpl extends AbstractPresenter implements FoAutoProcessMemberListPresenter, GetMemberBySamityIdInteractor.Callback {

    private AutoProcessMemberListView memberListView;
    private GetMemberBySamityIdInteractor getMemberBySamityIdInteractor;

    public FoAutoProcessMemberListPresenterImpl(Executor executor, MainThread mainThread, AutoProcessMemberListView memberListView) {
        super(executor, mainThread);
        this.memberListView = memberListView;
    }

    @Override
    public void getMemberList(int id) {

        if (memberListView != null) {

            memberListView.showProgress();
        }
        new GetMemberBySamityIdInteractorImpl(mExecutor, mMainThread, new MemberRepositoryImpl(), this, id).execute();
    }

    @Override
    public void itemClick(Member member) {

        memberListView.onItemclick(member);
    }

    @Override
    public void onDestroy() {

        memberListView = null;
    }

    @Override
    public void onMemberRetrieved(List<Member> memberList) {

        if (memberListView != null) {
            memberListView.setProcesses(memberList);
            memberListView.hideProgress();
        }
    }

    @Override
    public void noMemberFound() {

    }
}
