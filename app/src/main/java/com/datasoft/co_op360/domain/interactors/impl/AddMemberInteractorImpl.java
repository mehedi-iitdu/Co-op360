package com.datasoft.co_op360.domain.interactors.impl;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.interactors.AddMemberInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.repository.MemberRepository;
import com.datasoft.co_op360.domain.executor.MainThread;

/**
 * This interactor is responsible for creating and adding a new Member item into the database. It should get all the data needed to create
 * a new Member object and it should insert it in our repository.
 * <p/>
 * Created by dmilicic on 12/23/15.
 */
public class AddMemberInteractorImpl extends AbstractInteractor implements AddMemberInteractor {

    private Callback mCallback;
    private MemberRepository mMemberRepository;
    private Member member;

    public AddMemberInteractorImpl(Executor threadExecutor, MainThread mainThread,
                                   Callback callback, MemberRepository memberRepository, Member member) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mMemberRepository = memberRepository;
        this.member = member;
    }

    @Override
    public void run() {
        // create a new Member object and insert it
        mMemberRepository.insert(member);

        // notify on the main thread that we have inserted this item
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onMemberAdded();
            }
        });

    }
}
