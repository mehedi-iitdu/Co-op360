package com.datasoft.co_op360.domain.interactors.impl;


import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.GetAllMemberInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.repository.MemberRepository;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This interactor handles getting all Members from the database in a sorted manner. Members should be sorted by date with
 * the most recent one coming first and the oldest one coming last.
 * <p/>
 * Created by dmilicic on 12/10/15.
 */
public class GetAllMemberInteractorImpl extends AbstractInteractor implements GetAllMemberInteractor {

    private Callback mCallback;
    private MemberRepository mMemberRepository;

    private Comparator<Member> mMemberComparator = new Comparator<Member>() {
        @Override
        public int compare(Member lhs, Member rhs) {

            if (lhs.getId() < (rhs.getId()))
                return 1;

            if (rhs.getId() < (lhs.getId()))
                return -1;

            return 0;
        }
    };

    public GetAllMemberInteractorImpl(Executor threadExecutor, MainThread mainThread, MemberRepository memberRepository,
                                      Callback callback) {
        super(threadExecutor, mainThread);

        if (memberRepository == null || callback == null) {
            throw new IllegalArgumentException("Arguments can not be null!");
        }

        mMemberRepository = memberRepository;
        mCallback = callback;
    }

    @Override
    public void run() {
        // retrieve the Members from the database
        final List<Member> members = mMemberRepository.getAllMembers();

        // sort them so the most recent Member items come first, and oldest comes last
        Collections.sort(members, mMemberComparator);

        // Show Members on the main thread
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onMembersRetrieved(members);
            }
        });
    }
}
