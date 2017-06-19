package com.datasoft.co_op360.domain.interactors.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetMemberBySamityIdInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.repository.MemberRepository;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoAutoProcessMemberListPresenterImpl;

import java.util.List;

/**
 * Created by mehedi on 6/19/17.
 */

public class GetMemberBySamityIdInteractorImpl extends AbstractInteractor {

    MemberRepository memberRepository;
    GetMemberBySamityIdInteractor.Callback mCallback;
    int mSamityId;

    public GetMemberBySamityIdInteractorImpl(Executor threadExecutor, MainThread mainThread, MemberRepository memberRepository,
                                             GetMemberBySamityIdInteractor.Callback callback, int samity_id) {
        super(threadExecutor, mainThread);

        if (memberRepository == null || callback == null) {
            throw new IllegalArgumentException("Arguments can not be null!");
        }

        this.memberRepository = memberRepository;
        mCallback = callback;
        mSamityId = samity_id;
    }

    @Override
    public void run() {
        // retrieve the Members from the database
        final List<Member> memberList = memberRepository.getMembersBySamityId(mSamityId);

        // Show Samities on the main thread
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onMemberRetrieved(memberList);
            }
        });
    }
}
